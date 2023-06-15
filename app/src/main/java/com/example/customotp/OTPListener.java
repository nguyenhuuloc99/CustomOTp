package com.example.customotp;

public interface OTPListener {
    void onInteractionListener();

    /**
     * @param otp Filled OTP
     * Callback Fired when user has completed filling the OTP/PIN.
     */
    void onOTPComplete(String otp);
}
