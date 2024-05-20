package user;
import com.yrrhelp.grpc.User.APIResponse;
import com.yrrhelp.grpc.User.Empty;
import com.yrrhelp.grpc.User.LoginRequest;
import com.yrrhelp.grpc.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;
public class UserService extends userImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
	
		System.out.println("Inside login");
		String username=Request.getUsername();
		String password = request.getPassword();
		APIResponse.Builder response = APIResponse.newBuilder();
		if(username.equals(password))
		{
			response.setResponseCode(0).setResponsemessage("")//return success message
		}
		else {
			//reurn failure message
		}
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}
	

}
