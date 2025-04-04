<template>
    <h3>{{ yuan.name }}</h3>
    <p>{{ yuancontent }}</p>
    <p>{{ yuancontents() }}</p>
</template>
<script>

export default {
    data() {
        return {
            yuan: {
                name: ["qwe", "asd", "zxc"],
                content: ["前端", "Java", "Python"]
            }
        }
    },
    //计算属性
    computed: {
        yuancontent() {
            return this.yuan.content.length > 0 ? 'Yes' : 'No'
        }
    },
    // 放函数或方法
    methods:{
        yuancontents(){
            return this.yuan.content.length > 0 ? 'Yes' : 'No'
        }
    }
}

</script>