package com.instagram.debug.devoptions.section.identitycapture;

import X.0KC;
import X.0hq;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.T6A;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl;
import com.instagram.common.session.UserSession;

public final class IdentityCaptureOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public IdentityCaptureOptions$getItems$3(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1311174543);
        try {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("head_movements_directions_json", "[1,2,3]");
            Object newInstance = Class.forName("com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl").newInstance();
            0qQ.A0C(newInstance, "null cannot be cast to non-null type com.instagram.challenge.intf.IgSelfieCaptchaChallengeManager");
            FragmentActivity fragmentActivity = this.$activity;
            UserSession userSession = this.$userSession;
            0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            0qQ.A07(supportFragmentManager);
            UserSession userSession2 = this.$userSession;
            ((IgSelfieCaptchaChallengeManagerImpl) newInstance).A00(fragmentActivity, A0a, supportFragmentManager, userSession, new T6A(userSession2), "test-challenge", userSession2.A06, (String) null, "ig_selfie_test");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            0KC.A0F(IdentityCaptureOptions.TAG, "Exception when launching Selfie Capture", e);
        }
        AnonymousClass0fD.A0C(300841243, A05);
    }
}
