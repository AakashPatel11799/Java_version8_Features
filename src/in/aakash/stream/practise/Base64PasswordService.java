package in.aakash.stream.practise;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64PasswordService {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		String pssd = "ashok@123";

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(pssd.getBytes());
		String encryptedpsd = new String(digest);
		System.out.println("EncyptedPssd :: " + encryptedpsd);

		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(digest);
		System.out.println("EncyptedPssd + Encoded :: " + new String(encode));

		/*
		 * String pwd = "aakash@13"; Encoder encoder = Base64.getEncoder(); //
		 * converting stringto byte[] array and passing as input for encode() method
		 * byte[] encode = encoder.encode(pwd.getBytes());
		 * 
		 * // converting byte[] array to string String encodepsd = new String(encode);
		 * System.out.println(encodepsd); // YWFrYXNoQDEz
		 * 
		 * Decoder decoder = Base64.getDecoder(); byte[] decode =
		 * decoder.decode(encodepsd.getBytes());
		 * 
		 * String decodepsw = new String(decode); System.out.println(decodepsw);
		 */
	}

}
