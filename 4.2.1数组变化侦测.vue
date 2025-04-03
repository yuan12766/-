<template>
    <h3>数组变化侦测</h3>
    <button @click="addListHandle">添加数据</button>
    <ul>
        <li v-for="(item,index) of names" :key="index">{{ item }}</li>
    </ul>

    <button @click="concatHandle">合并数组</button> 
    <h3>数组1
        <p v-for="(item,index) of names1" :key="index">{{ item }}</p>
    </h3>
    <h3>数组2
        <p v-for="(item,index) of names2" :key="index">{{ item }}</p>
    </h3>
</template>
<script>

export default {
    data() {
        return {
            names:["请问","qwe","asd"],
            names1:[1,2,3,4,5],
            names2:[6,7,8,9,0]
        }
    },
    methods:{
        addListHandle(){
            // 变更方法
            this.names.push("sakura")
            // 替换数组
            this.names = this.names.concat(["sakura"])
        },
        concatHandle(){
            this.names1 = this.names1.concat(this.names2)
        }
    }
}

</script>