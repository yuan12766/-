<template>
    <!-- v-on指令(@) -->
    <h3>内联事件处理器</h3>
    <button @click="count++">Add 1</button>
    <p>{{ count }}</p>

    <h3>方法事件处理器</h3>
    <button @click="addCount2">Add 1</button>
    <p>{{ count2 }}</p>
</template>

<script>

    const { log } = console;

    export default{
        data(){
            return{
                count:0,
                count2:0,
            }
        },
        methods:{
            addCount2(){
                // 读取data里面的数据的方案：this.count2
                this.count2++
            }
        }
    }

</script>
