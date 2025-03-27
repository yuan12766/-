<template>
    <h3>列表渲染</h3>

    <!-- v-for指令 -->

    <p v-for="item in names">{{ item }}</p>
    <p v-for="item of names">{{ item }}</p>

    <div v-for="item2 in results">
        <p>{{ item2.title }}</p>
        <img :src="item2.avator" alt="">
    </div>

    <p v-for="(item,index) in names">{{ item }}-{{ index }}</p>

    <!-- 遍历 -->

    <div>
        <p v-for="(item3,key,index) of userInfo">{{ item3 }}-{{ key }}-{{ index }}</p>
    </div>
    
</template>
<script>

export default {
    data() {
        return {
            names: ["qwe", "rty", "asd"],
            results: [
                {
                    "id": 2261677,
                    "title": "云",
                    "avator": "https://p1.meituan.net/biztone/f292a1d686ade94cd6a2ee037a626fe24594589.jpg%40watermark%3D0"
                },
                {
                    "id": 225367,
                    "title": "荷叶",
                    "avator": "https://img0.baidu.com/it/u=3815233218,1054029691&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=667"
                },
                {
                    "id": 223467,
                    "title": "山",
                    "avator": "https://img1.baidu.com/it/u=3788947154,3138519127&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=601"
                }
            ],
            userInfo:{
                name:"qwe",
                age:18,
                sex:"男"
            }
        }
    }
}

</script>
<style>

</style>