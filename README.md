# RvWithHeader
Header가 있는 RecyclerView 예제다. ConcatAdapter를 사용하면 Header를 쉽게 구현할 수 있다. [MergeAdapter에서 이름이 ConcatAdapter로 변경](https://developer.android.com/jetpack/androidx/releases/recyclerview#recyclerview-1.2.0-alpha04)되었다.

- HeaderAdapter와 HeaderViewHolder를 만든다.
- 리스트를 위한 FlowersAdapter와 FlowerViewHolder를 만든다.
- ConcatAdapter에 HeaderAdapter, FlowersAdapter를 차례대로 넣는다.