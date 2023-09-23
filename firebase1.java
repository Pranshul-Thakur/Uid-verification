import 'package:firebase_auth/firebase_auth.dart';

Future<void> signUpWithEmailAndPassword(String email, String password) async {
  try {
    UserCredential userCredential = await FirebaseAuth.instance
        .createUserWithEmailAndPassword(
      email: email,
      password: password,
    );
    // You can now access the UID of the newly created user as userCredential.user.uid
    String uid = userCredential.user.uid;
    print('User UID: $uid');
  } catch (e) {
    print('Error creating user: $e');
  }
}
