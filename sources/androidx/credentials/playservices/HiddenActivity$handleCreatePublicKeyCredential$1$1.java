package androidx.credentials.playservices;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.AnonymousClass7TF;
import X.C60340gF;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final class HiddenActivity$handleCreatePublicKeyCredential$1$1 extends 0Yg implements 0sP {
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ HiddenActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleCreatePublicKeyCredential$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    public final void invoke(PendingIntent pendingIntent) {
        0qQ.A0B(pendingIntent, 0);
        try {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.$requestCode, (Intent) null, 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            0qQ.A0A(resultReceiver);
            hiddenActivity2.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, AnonymousClass7TF.A0m("During public key credential, found IntentSender failure on public key creation: ", e));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PendingIntent) obj);
        return C60340gF.A00;
    }
}
