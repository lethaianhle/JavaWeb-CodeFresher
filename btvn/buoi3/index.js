let display = document.getElementById('display');

function addBtn(){
    let name = document.getElementById('name').value;
    let age = parseInt(document.getElementById('age').value);

    if(age == '' || name == ''){
        display.innerText = 'Dữ liệu nhập vào thiếu!';
    } else if(isNaN(age) || age < 1){
        display.innerText = 'Tuổi phải là số nguyên dương!';
    } else if(name && age){
        display.innerText = '';
        let data = localStorage.getItem('item') ? JSON.parse(localStorage.getItem('item')) : [];
        let item = {
            name: name,
            age: age
        }
        data.unshift(item);
        console.log(data);
        localStorage.setItem('item', JSON.stringify(data));
    }
    resetInput();
    renderData();
}

// function checkInput() {
//     let name = document.getElementById('name').value;
//     let age = parseInt(document.getElementById('age').value);
//     console.log(age);
//     if(name == '' || age == ''){
//         display.innerText = 'Dữ liệu nhập vào thiếu!';
//     }
//     if(isNaN(age) || age < 1){
//         display.innerText = 'Tuổi phải là số nguyên dương!';
//     }
// }

function resetInput() {
    document.getElementById('name').value = '';
    document.getElementById('age').value = '';
}

function renderData() {
    let data = localStorage.getItem('item') ? JSON.parse(localStorage.getItem('item')) : [];
    let show = ``;
    for(let i =0; i < data.length; i ++){
        show += `<tr>
                    <td>${data[i].name}</td>
                    <td>${data[i].age}</td>
                    <td>
                    <button type="button" class="btn btn-success" onClick="editBtn(${i})">Edit</button>
                        <button type="button" class="btn btn-danger" onClick="deleteBtn(${i})">Delete</button>
                    </td>
                </tr>`;
    }
    document.getElementById('show').innerHTML = show;
}

function editBtn(key) {
    let data = localStorage.getItem('item') ? JSON.parse(localStorage.getItem('item')) : [];
    document.getElementById('addDataBtn').style.display = 'none';
    document.getElementById('editDataBtn').style.display = '';
    document.getElementById('name').value = data[key].name;
    document.getElementById('age').value = data[key].age;
    document.getElementById('index').value = key;
}

function changeData() {
    let data = localStorage.getItem('item') ? JSON.parse(localStorage.getItem('item')) : [];
    let index = document.getElementById('index').value;
    data[index].name = document.getElementById('name').value;
    data[index].age = document.getElementById('age').value;
    localStorage.setItem('item', JSON.stringify(data));
    resetInput();
    renderData();
    document.getElementById('addDataBtn').style.display = '';
    document.getElementById('editDataBtn').style.display = 'none';
}

function deleteBtn(key) {
    let data = localStorage.getItem('item') ? JSON.parse(localStorage.getItem('item')) : [];
    if(confirm('Are u sure want to delete that?')){
        data.splice(key, 1);
    }
    localStorage.setItem('item', JSON.stringify(data));
    renderData();
}