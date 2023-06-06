import { createSlice } from "@reduxjs/toolkit"

const initialState ={
    value: 1,
    userId: -1,
    username: '',
    isLoad: true,
}

const userReducer = createSlice({
    name: 'user',
    initialState,
    reducers: {
        setUser: (state,action)=>{
            state.userId = action.payload.userId;
            state.username = action.payload.username;
        }
    }
});

export const {setUser} = userReducer.actions;
export default userReducer.reducer;