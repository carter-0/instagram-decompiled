package X;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.android.R;
import java.util.concurrent.Executor;

/* renamed from: X.SdK  reason: case insensitive filesystem */
public final class C11617SdK implements C13762Tga {
    public final CredentialManager A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:116|117|118) */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02af, code lost:
        return new X.C7396QAz(r2, r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x02aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C8987RKd A01(android.credentials.CreateCredentialException r5) {
        /*
            r4 = 0
            java.lang.String r2 = r5.getType()
            int r0 = r2.hashCode()
            switch(r0) {
                case -2055374133: goto L_0x005e;
                case 1316905704: goto L_0x004c;
                case 2092588512: goto L_0x003a;
                case 2131915191: goto L_0x0028;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r1 = r5.getType()
            X.0qQ.A07(r1)
            java.lang.String r3 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r0 = 1
            boolean r0 = X.C66580MXl.A1a(r3, r0, r1)
            java.lang.String r2 = r5.getType()
            X.0qQ.A07(r2)
            java.lang.String r1 = r5.getMessage()
            if (r0 == 0) goto L_0x02bc
            goto L_0x0070
        L_0x0028:
            java.lang.String r1 = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r5.getMessage()
            X.QAv r3 = new X.QAv
            r3.<init>(r1, r0)
            return r3
        L_0x003a:
            java.lang.String r1 = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r5.getMessage()
            X.QAu r3 = new X.QAu
            r3.<init>(r1, r0)
            return r3
        L_0x004c:
            java.lang.String r1 = "android.credentials.CreateCredentialException.TYPE_UNKNOWN"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r5.getMessage()
            X.QAx r3 = new X.QAx
            r3.<init>(r1, r0)
            return r3
        L_0x005e:
            java.lang.String r1 = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r5.getMessage()
            X.QAt r3 = new X.QAt
            r3.<init>(r1, r0)
            return r3
        L_0x0070:
            boolean r0 = X.00l.A0d(r2, r3, r4)     // Catch:{ RK4 -> 0x02b6 }
            if (r0 == 0) goto L_0x02b0
            java.lang.String r4 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.QBZ r5 = new X.QBZ     // Catch:{ RK4 -> 0x02aa }
            r5.<init>()     // Catch:{ RK4 -> 0x02aa }
            r0 = 0
            X.QBc r3 = new X.QBc     // Catch:{ RK4 -> 0x02aa }
            r3.<init>(r5, r0)     // Catch:{ RK4 -> 0x02aa }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0097
            X.QB9 r0 = new X.QB9     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
        L_0x0094:
            X.RKd r3 = (X.C8987RKd) r3     // Catch:{ RK4 -> 0x02aa }
            return r3
        L_0x0097:
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x00a9
            X.QBA r0 = new X.QBA     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x00a9:
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x00bb
            X.QBB r0 = new X.QBB     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x00bb:
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x00cd
            X.QBC r0 = new X.QBC     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x00cd:
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x00df
            X.QBD r0 = new X.QBD     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x00df:
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x00f1
            X.QBE r0 = new X.QBE     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x00f1:
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0103
            X.QBF r0 = new X.QBF     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0103:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0115
            X.QBG r0 = new X.QBG     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0115:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0128
            X.QBH r0 = new X.QBH     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0128:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x013b
            X.QBI r0 = new X.QBI     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x013b:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x014e
            X.QBJ r0 = new X.QBJ     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x014e:
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0161
            X.QBK r0 = new X.QBK     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0161:
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0174
            X.QBL r0 = new X.QBL     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0174:
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0187
            X.QBM r0 = new X.QBM     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0187:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x019a
            X.QBN r0 = new X.QBN     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x019a:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x01ad
            X.QBO r0 = new X.QBO     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x01ad:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x01c0
            X.QBP r0 = new X.QBP     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x01c0:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x01d3
            X.QBQ r0 = new X.QBQ     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x01d3:
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x01e6
            X.QBR r0 = new X.QBR     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x01e6:
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x01f9
            X.QBS r0 = new X.QBS     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x01f9:
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x020c
            X.QBT r0 = new X.QBT     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x020c:
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x021f
            X.QBU r0 = new X.QBU     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x021f:
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0232
            X.QBV r0 = new X.QBV     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0232:
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0245
            X.QBW r0 = new X.QBW     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0245:
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0258
            X.QBX r0 = new X.QBX     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0258:
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x026b
            X.QBY r0 = new X.QBY     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x026b:
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x027e
            X.QBZ r0 = new X.QBZ     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x027e:
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x0291
            X.QBa r0 = new X.QBa     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x0291:
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02aa }
            if (r0 == 0) goto L_0x02a4
            X.QBb r0 = new X.QBb     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02aa }
            goto L_0x0094
        L_0x02a4:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x02aa }
            r0.<init>()     // Catch:{ RK4 -> 0x02aa }
            throw r0     // Catch:{ RK4 -> 0x02aa }
        L_0x02aa:
            X.QAz r3 = new X.QAz     // Catch:{ RK4 -> 0x02b6 }
            r3.<init>(r2, r1)     // Catch:{ RK4 -> 0x02b6 }
            return r3
        L_0x02b0:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x02b6 }
            r0.<init>()     // Catch:{ RK4 -> 0x02b6 }
            throw r0     // Catch:{ RK4 -> 0x02b6 }
        L_0x02b6:
            X.QAz r3 = new X.QAz
            r3.<init>(r2, r1)
            return r3
        L_0x02bc:
            X.QAz r3 = new X.QAz
            r3.<init>(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11617SdK.A01(android.credentials.CreateCredentialException):X.RKd");
    }

    public final void onCreateCredential(Context context, C10648Rvh rvh, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
        int i;
        C13683Tez tez2 = tez;
        C13347TVu tVu = new C13347TVu((Object) tez2, 12);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            tVu.invoke();
            return;
        }
        OutcomeReceiver swn = new SWN(rvh, tez2, this);
        0qQ.A0A(credentialManager);
        String str = rvh.A03;
        Bundle bundle = rvh.A01;
        C10507RtM rtM = rvh.A02;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", rtM.A01);
        CharSequence charSequence = rtM.A00;
        if (!TextUtils.isEmpty(charSequence)) {
            A0a.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        String str2 = rtM.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0a.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", str2);
        }
        if (rvh instanceof C7380QAg) {
            i = R.drawable.ic_password;
        } else {
            boolean z = rvh instanceof C7379QAf;
            i = R.drawable.ic_other_sign_in;
            if (z) {
                i = R.drawable.ic_passkey;
            }
        }
        A0a.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, i));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", A0a);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder(str, bundle, rvh.A00).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        0qQ.A07(alwaysSendAppInfoToProvider);
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        0qQ.A07(build);
        credentialManager.createCredential(context, build, cancellationSignal, executor, swn);
    }

    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT < 34 || this.A00 == null) {
            return false;
        }
        return true;
    }

    public final void onGetCredential(Context context, C10339Rqc rqc, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez) {
        C13683Tez tez2 = tez;
        C13347TVu tVu = new C13347TVu((Object) tez2, 13);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            tVu.invoke();
            return;
        }
        OutcomeReceiver swl = new SWL(tez2, this);
        0qQ.A0A(credentialManager);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        A0a.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", rqc.A01);
        A0a.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", (Parcelable) null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(A0a);
        for (C10717Rwv rwv : rqc.A00) {
            builder.addCredentialOption(new CredentialOption.Builder(rwv.A02, rwv.A01, rwv.A00).setIsSystemProviderRequired(false).setAllowedProviders(rwv.A03).build());
        }
        GetCredentialRequest build = builder.build();
        0qQ.A07(build);
        credentialManager.getCredential(context, build, cancellationSignal, executor, swl);
    }

    public C11617SdK(Context context) {
        this.A00 = (CredentialManager) context.getSystemService("credential");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C10144RnL A00(android.credentials.GetCredentialResponse r4) {
        /*
            android.credentials.Credential r0 = r4.getCredential()
            X.0qQ.A07(r0)
            java.lang.String r4 = r0.getType()
            X.0qQ.A07(r4)
            android.os.Bundle r3 = r0.getData()
            X.0qQ.A07(r3)
            java.lang.String r0 = "android.credentials.TYPE_PASSWORD_CREDENTIAL"
            boolean r0 = r4.equals(r0)     // Catch:{ RK4 -> 0x005e }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_ID"
            java.lang.String r2 = r3.getString(r0)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_PASSWORD"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0058 }
            X.0qQ.A0A(r2)     // Catch:{ Exception -> 0x0058 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x0058 }
            X.QAm r1 = new X.QAm     // Catch:{ Exception -> 0x0058 }
            r1.<init>(r3, r2, r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0071
        L_0x0035:
            java.lang.String r0 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            boolean r0 = r4.equals(r0)     // Catch:{ RK4 -> 0x005e }
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x004c }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x004c }
            X.QAl r1 = new X.QAl     // Catch:{ Exception -> 0x004c }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x004c }
            goto L_0x0071
        L_0x004c:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x005e }
            r0.<init>()     // Catch:{ RK4 -> 0x005e }
            goto L_0x005d
        L_0x0052:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x005e }
            r0.<init>()     // Catch:{ RK4 -> 0x005e }
            goto L_0x005d
        L_0x0058:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x005e }
            r0.<init>()     // Catch:{ RK4 -> 0x005e }
        L_0x005d:
            throw r0     // Catch:{ RK4 -> 0x005e }
        L_0x005e:
            X.QAk r1 = new X.QAk
            r1.<init>(r3)
            int r0 = r4.length()
            if (r0 > 0) goto L_0x0071
            java.lang.String r0 = "type should not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0071:
            X.RnL r0 = new X.RnL
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11617SdK.A00(android.credentials.GetCredentialResponse):X.RnL");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:116|117|118) */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ae, code lost:
        return new X.QB6(r2, r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x02a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C8988RKe A02(android.credentials.GetCredentialException r5) {
        /*
            java.lang.String r2 = r5.getType()
            int r0 = r2.hashCode()
            switch(r0) {
                case -781118336: goto L_0x005d;
                case -45448328: goto L_0x004b;
                case 580557411: goto L_0x0039;
                case 627896683: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = r5.getType()
            X.0qQ.A07(r0)
            java.lang.String r4 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r3 = 1
            boolean r0 = X.C66580MXl.A1a(r4, r3, r0)
            java.lang.String r2 = r5.getType()
            X.0qQ.A07(r2)
            java.lang.String r1 = r5.getMessage()
            if (r0 == 0) goto L_0x02bb
            goto L_0x006f
        L_0x0027:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.QB5 r3 = new X.QB5
            r3.<init>(r1, r0)
            return r3
        L_0x0039:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.QB1 r3 = new X.QB1
            r3.<init>(r1, r0)
            return r3
        L_0x004b:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.QB2 r3 = new X.QB2
            r3.<init>(r1, r0)
            return r3
        L_0x005d:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.QB8 r3 = new X.QB8
            r3.<init>(r1, r0)
            return r3
        L_0x006f:
            boolean r0 = X.C66580MXl.A1a(r4, r3, r2)     // Catch:{ RK4 -> 0x02b5 }
            if (r0 == 0) goto L_0x02af
            java.lang.String r4 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.QBZ r5 = new X.QBZ     // Catch:{ RK4 -> 0x02a9 }
            r5.<init>()     // Catch:{ RK4 -> 0x02a9 }
            r0 = 0
            X.QBd r3 = new X.QBd     // Catch:{ RK4 -> 0x02a9 }
            r3.<init>(r5, r0)     // Catch:{ RK4 -> 0x02a9 }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0096
            X.QB9 r0 = new X.QB9     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
        L_0x0093:
            X.RKe r3 = (X.C8988RKe) r3     // Catch:{ RK4 -> 0x02a9 }
            return r3
        L_0x0096:
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x00a8
            X.QBA r0 = new X.QBA     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x00a8:
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x00ba
            X.QBB r0 = new X.QBB     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x00ba:
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x00cc
            X.QBC r0 = new X.QBC     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x00cc:
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x00de
            X.QBD r0 = new X.QBD     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x00de:
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x00f0
            X.QBE r0 = new X.QBE     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x00f0:
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0102
            X.QBF r0 = new X.QBF     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0102:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0114
            X.QBG r0 = new X.QBG     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0114:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0127
            X.QBH r0 = new X.QBH     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0127:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x013a
            X.QBI r0 = new X.QBI     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x013a:
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x014d
            X.QBJ r0 = new X.QBJ     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x014d:
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0160
            X.QBK r0 = new X.QBK     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0160:
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0173
            X.QBL r0 = new X.QBL     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0173:
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0186
            X.QBM r0 = new X.QBM     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0186:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0199
            X.QBN r0 = new X.QBN     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0199:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x01ac
            X.QBO r0 = new X.QBO     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x01ac:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x01bf
            X.QBP r0 = new X.QBP     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x01bf:
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x01d2
            X.QBQ r0 = new X.QBQ     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x01d2:
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x01e5
            X.QBR r0 = new X.QBR     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x01e5:
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x01f8
            X.QBS r0 = new X.QBS     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x01f8:
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x020b
            X.QBT r0 = new X.QBT     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x020b:
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x021e
            X.QBU r0 = new X.QBU     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x021e:
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0231
            X.QBV r0 = new X.QBV     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0231:
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0244
            X.QBW r0 = new X.QBW     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0244:
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0257
            X.QBX r0 = new X.QBX     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0257:
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x026a
            X.QBY r0 = new X.QBY     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x026a:
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x027d
            X.QBZ r0 = new X.QBZ     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x027d:
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x0290
            X.QBa r0 = new X.QBa     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x0290:
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A03(r4, r0, r2)     // Catch:{ RK4 -> 0x02a9 }
            if (r0 == 0) goto L_0x02a3
            X.QBb r0 = new X.QBb     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            java.lang.Exception r3 = X.C9168RRt.A00(r0, r3, r1)     // Catch:{ RK4 -> 0x02a9 }
            goto L_0x0093
        L_0x02a3:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x02a9 }
            r0.<init>()     // Catch:{ RK4 -> 0x02a9 }
            throw r0     // Catch:{ RK4 -> 0x02a9 }
        L_0x02a9:
            X.QB6 r3 = new X.QB6     // Catch:{ RK4 -> 0x02b5 }
            r3.<init>(r2, r1)     // Catch:{ RK4 -> 0x02b5 }
            return r3
        L_0x02af:
            X.RK4 r0 = new X.RK4     // Catch:{ RK4 -> 0x02b5 }
            r0.<init>()     // Catch:{ RK4 -> 0x02b5 }
            throw r0     // Catch:{ RK4 -> 0x02b5 }
        L_0x02b5:
            X.QB6 r3 = new X.QB6
            r3.<init>(r2, r1)
            return r3
        L_0x02bb:
            X.QB6 r3 = new X.QB6
            r3.<init>(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11617SdK.A02(android.credentials.GetCredentialException):X.RKe");
    }

    public static boolean A03(String str, String str2, String str3) {
        return str3.equals(002.A0R(str, str2));
    }
}
