// 등록화면 이동
const goToForm = () => {
    location.href = "/board/form";
}

// validation
const validInputs = () => {
    let inputAry = document.querySelectorAll("input,textarea"); // 입력항목들 select
    let successFlag = true;
    for(const input of inputAry){   // 모든 입력항목들의 value값을 하나씩 확인
        let {value : valCheck} = input; // input 객체의 value attribute를 가져와서 valCheck라고 변수 생성
        if(valCheck === ""){    // 값이 비어있을 경우 false 리턴
            successFlag = false;
            break;  // for 문 종료
        }        
    }
    return successFlag;
}

// 등록처리
const insertBoard = () => {
    let validResult = validInputs();    // 필수값 입력 확인
    if(!validResult){   // 필수값 입력이 안되어있으면
        const modalToggleBtn = document.querySelector("#modalToggleBtn");   // modal을 열어주는 버튼 객체 찾기
        if(modalToggleBtn){ // modal 버튼이 있는 경우 클릭 이벤트 부여
            modalToggleBtn.click();
        }else{  // 없을 경우 그냥 alert창만 띄우기
            alert("필수값을 확인해주세요.");
        }

        return false;
    }else{  // action page로 submit
        // json 전송을 위해 fetch api call
        let jsonData = {
            ttl : document.querySelector("input[name=title]").value,
            ctt : document.querySelector("textarea[name=ctt]").value,
            pwd : document.querySelector("input[name=pwd]").value,
        }        

        let sendData = {
            method : "POST",
            body : JSON.stringify(jsonData),
            headers : {                
                'Content-Type': 'application/json'
            }
        }

        fetch('/board/action', sendData)    
            .then(response => response.json())
            .then(data => {
                console.log(data);                
            })
            .catch(error => {
                console.log(error);
            })
    }
}

// 목록화면 이동
const goToList = () => {
    location.href = "/web/board/list.jsp";
}


// 상세화면 이동
const goToDetail = (num) => {
    location.href = `/web/board/view.jsp?num=${num}`;
}