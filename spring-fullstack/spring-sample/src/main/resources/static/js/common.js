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
            mode : document.querySelector("input[name=mode]").value,
        }        

        let sendData = {
            method : "POST",
            body : JSON.stringify(jsonData),
            headers : {                
                'Content-Type': 'application/json'
            }
        }

        // fetch call
        fetch('/board/action', sendData)    
            .then(response => response.json())
            .then(data => {
                if(data > 0){
                    alert("정상 등록됐습니다.");
                    location.href = "/board/list";
                }            
            })
            .catch(error => {
                alert("처리 중 오류가 발생했습니다.");
                return false;                
            })
    }
}

// 목록화면 이동
const goToList = () => {
    location.href = "/board/list";
}


// 상세화면 이동
const goToDetail = (num) => {
    location.href = `/board/detail?seq=${num}`;
}

// 수정모드로 변경 (토글로 처리)
const changeUpdateForm = () => {
    // 모드에 따른 버튼 보여주기 처리를 위해 객체 불러오기
    const updateBtn = document.querySelector("#updateBtn");
    const updateCancelBtn = document.querySelector("#updateCancelBtn");
    const updateOnBtn = document.querySelector("#updateOnBtn");

    const modeObj = document.querySelector("input[name=mode]"); // 현재 모드 확인하기
    // view --> 수정모드로 변경 / update --> 조회모드로 변경
    if(modeObj.value === "view"){
        // 모든 input의 readonly 제거 및 textarea의 readonly 제거
        const inputAry = document.querySelectorAll("input");
        for(const input of inputAry){
            if(input.id === "num" || input.id === "regDate") continue;
            input.removeAttribute("readonly");
        }
        const textAreaCtt= document.querySelector("textarea[name=ctt]");
        textAreaCtt.removeAttribute("readonly");

        // 편집 버튼 display 변경
        updateBtn.classList.add("d-none");
        updateCancelBtn.classList.remove("d-none");
        updateOnBtn.classList.remove("d-none");

        // 모드 변경처리
        modeObj.value = "update";
    }else if(modeObj.value === "update"){
        // 모든 input의 readonly 추가 및 textarea의 readonly 추가
        const inputAry = document.querySelectorAll("input");
        for(const input of inputAry){
            if(input.id === "num" || input.id === "regDate") continue;
            input.setAttribute("readonly", true);            
        }
        const textAreaCtt= document.querySelector("textarea[name=ctt]");
        textAreaCtt.setAttribute("readonly", true);

        // 편집 버튼 display 변경
        updateBtn.classList.remove("d-none");
        updateCancelBtn.classList.add("d-none");
        updateOnBtn.classList.add("d-none");

        // 모드 변경처리
        modeObj.value = "view";
    }
}

// 수정처리
const updateBoard = () => {
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
        let seq = document.querySelector("input[name=num]").value;       
        let jsonData = {
            seq : document.querySelector("input[name=num]").value,
            ttl : document.querySelector("input[name=title]").value,
            ctt : document.querySelector("textarea[name=ctt]").value,            
            mode : document.querySelector("input[name=mode]").value,
        }        

        let sendData = {
            method : "POST",
            body : JSON.stringify(jsonData),
            headers : {                
                'Content-Type': 'application/json'
            }
        }

        // fetch call
        fetch('/board/action', sendData)    
            .then(response => response.json())
            .then(data => {
                if(data > 0){
                    alert("정상 등록됐습니다.");
                    location.href = `/board/detail?seq=${seq}`;
                }            
            })
            .catch(error => {
                alert("처리 중 오류가 발생했습니다.");
                return false;                
            })
    }
}

// 삭제처리
const deleteBoard = () => {
    if(confirm("정말 삭제하시겠습니까?")){        
        let jsonData = {
            seq : document.querySelector("input[name=num]").value,
        }        

        let sendData = {
            method : "POST",
            body : JSON.stringify(jsonData),
            headers : {                
                'Content-Type': 'application/json'
            }
        }

        // fetch call
        fetch('/board/delete', sendData)    
            .then(response => response.json())
            .then(data => {
                if(data > 0){
                    alert("삭제됐습니다.");
                    location.href = '/board/list';
                }            
            })
            .catch(error => {
                alert("처리 중 오류가 발생했습니다.");
                return false;                
            })
    }
}