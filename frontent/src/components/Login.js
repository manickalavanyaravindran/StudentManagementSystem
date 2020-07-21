import React from 'react';

class Login extends React.Component {
    constructor()
    {
        super();
        this.state={
            userName:'',
            password:'',
            result:'',
            message:''
        };
        this.handleChange= this.handleChange.bind(this);
        this.handleSubmit=this.handleSubmit.bind(this);
        }
        handleChange=(eventObj)=>{
     let {name,value}= eventObj.target;
     this.setState({[name]:value})
     this.setState({result:''})
        }
        handleSubmit=(eventObj)=>{
            eventObj.preventDefault();
            if(this.state.userName==='' && this.state.password===''){
                this.setState({result:'required'})
            }
            else {Axios.post("http://localhost:8080/login",this.state).then(response=>{
                this.setState({message:response.data})
                this.props.history.push('/view')
            })
            }
        }
        render() {
            const {result}=this.state;
            return(
                <form onSubmit={this.handleSubmit} noValidate>
                    <h3>Login </h3>
                    <div className='form-group'>
                        <label>Username</label>
                        <input type="text" name='userName' placeholder='Enter your Username' onChange={this.handleChange}/>
                        {
                            result && 
                            <div className='error'>{this.state.result}</div>
                        }
                        </div>
                        <div className='form-group'>
                        <label>Password</label>
                        <input type="text" name='password' placeholder='Enter your Password' onChange={this.handleChange} noValidate/>
                        {
                            result && 
                            <div className='error'>{this.state.result}</div>
                        }
                        </div>
                        <button type='submit'>Submit</button>
                        <p><a href='/'>Cancel</a></p>
                    
                    
                    </form>
            );
        }
    
}
export default Login;