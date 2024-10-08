package X;

import com.facebook.ale.p003native.AvatarLiveEditingNotificationDelegate;

public final class WF9 implements AvatarLiveEditingNotificationDelegate {
    public final /* synthetic */ VQW A00;

    public final synchronized void onAvatarGenerationBegin(String str) {
        0qQ.A0B(str, 0);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new C14920UFe(str));
        }
    }

    public final synchronized void onAvatarGenerationEnd(boolean z, String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new C14925UFl(V5T.A00(str2), str, str3, z));
        }
    }

    public final synchronized void onAvatarParametersUpdateBegin(String str) {
        0qQ.A0B(str, 0);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new C14921UFf(str));
        }
    }

    public final synchronized void onAvatarParametersUpdateEnd(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new UFi(str, V5T.A00(str2)));
        }
    }

    public final synchronized void onAvatarRenderUpdateBegin(String str) {
        0qQ.A0B(str, 0);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new C14922UFg(str));
        }
    }

    public final synchronized void onAvatarRenderUpdateEnd(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new UFj(str, V5T.A00(str2)));
        }
    }

    public final synchronized void onAvatarUpdateBegin(String str) {
        0qQ.A0B(str, 0);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new C14923UFh(str));
        }
    }

    public final synchronized void onAvatarUpdateEnd(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        for (X27 CxI : this.A00.A01) {
            CxI.CxI(new C14924UFk(str, V5T.A00(str2)));
        }
    }

    public WF9(VQW vqw) {
        this.A00 = vqw;
    }
}
