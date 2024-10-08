package X;

import android.os.Process;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mca.Mailbox;
import java.util.Map;

public final class MYN extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MYN(int i, String str, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                Map map = (Map) obj;
                0qQ.A0B(map, 0);
                map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A02);
                map.put("threadPriority", Integer.valueOf(Process.getThreadPriority(Process.myTid())));
                map.put("waiting-on", Integer.valueOf(this.A01));
                break;
            case 1:
                AnonymousClass5SW r6 = (AnonymousClass5SW) obj;
                0qQ.A0B(r6, 0);
                int i = this.A01;
                if (i > 0) {
                    str = 002.A0G(this.A02, ' ', i);
                } else {
                    str = this.A02;
                }
                C285645Sc.A03(r6, str);
                C285645Sc.A02(r6, 0);
                break;
            default:
                Mailbox A0H = C66581MXm.A0H(obj);
                return 1aU.A07(new C72139Owy(A0H, this.A02, this.A01), AnonymousClass6F9.A00("insert push path notification"));
        }
        return C60340gF.A00;
    }
}
