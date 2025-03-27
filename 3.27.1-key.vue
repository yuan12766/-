<template>
    <h3>Key引入v-for中</h3>
    <p v-for="(item, index) of names" :key="index">{{ item }}</p>
    <div v-for="item2 in results" :key="item2.id">
        <p>{{ item2.title }}</p>
        <img :src="item2.avator" alt="">
    </div>
</template>

<script>

export default {
    data() {
        return {
            names: ["qwe", "asd", "zxc"],
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
        }

    }
}

</script>