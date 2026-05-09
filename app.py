import streamlit as st


st.set_page_config(page_title="Linked Structures Tutor", page_icon="🔗", layout="wide")

st.title("🔗 Linked Data Structures Tutor")
st.write(
    "This tutor app turns the linked list, stack, and queue lab into an interactive study tool with live operations and plain-language explanations."
)

if "lab4_stack" not in st.session_state:
    st.session_state.lab4_stack = []
if "lab4_queue" not in st.session_state:
    st.session_state.lab4_queue = []
if "lab4_list" not in st.session_state:
    st.session_state.lab4_list = ["A", "B", "C"]

tab1, tab2, tab3 = st.tabs(["Stack", "Queue", "Positional List"])

with tab1:
    st.subheader("Linked Stack")
    push_value = st.text_input("Value to push", "10", key="stack_push")
    cols = st.columns(3)
    if cols[0].button("Push", use_container_width=True):
        st.session_state.lab4_stack.append(push_value)
    if cols[1].button("Pop", use_container_width=True) and st.session_state.lab4_stack:
        st.session_state.lab4_stack.pop()
    if cols[2].button("Clear Stack", use_container_width=True):
        st.session_state.lab4_stack = []
    st.write("Current stack (bottom → top):", st.session_state.lab4_stack)
    st.info("Stacks follow LIFO: the last value pushed is the first value popped.")

with tab2:
    st.subheader("Linked Queue")
    enqueue_value = st.text_input("Value to enqueue", "20", key="queue_push")
    cols = st.columns(3)
    if cols[0].button("Enqueue", use_container_width=True):
        st.session_state.lab4_queue.append(enqueue_value)
    if cols[1].button("Dequeue", use_container_width=True) and st.session_state.lab4_queue:
        st.session_state.lab4_queue.pop(0)
    if cols[2].button("Clear Queue", use_container_width=True):
        st.session_state.lab4_queue = []
    st.write("Current queue (front → back):", st.session_state.lab4_queue)
    st.info("Queues follow FIFO: the earliest inserted value leaves first.")

with tab3:
    st.subheader("Positional List")
    new_item = st.text_input("New list item", "X", key="list_item")
    position = st.number_input("Insert position", min_value=0, max_value=len(st.session_state.lab4_list), value=len(st.session_state.lab4_list))
    cols = st.columns(3)
    if cols[0].button("Insert", use_container_width=True):
        st.session_state.lab4_list.insert(position, new_item)
    if cols[1].button("Remove Last", use_container_width=True) and st.session_state.lab4_list:
        st.session_state.lab4_list.pop()
    if cols[2].button("Reset List", use_container_width=True):
        st.session_state.lab4_list = ["A", "B", "C"]
    st.write("Current positional list:", st.session_state.lab4_list)
    st.caption("A positional list cares about the location of elements, not just their values.")
