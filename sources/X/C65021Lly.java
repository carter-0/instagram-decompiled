package X;

import android.text.Editable;
import android.text.Selection;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* renamed from: X.Lly  reason: case insensitive filesystem */
public final class C65021Lly implements C358538b4 {
    public final int A00;
    public final Object A01;

    public C65021Lly(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void DIL() {
    }

    public final /* synthetic */ void DLf() {
    }

    public final void DRH(User user, int i) {
        UserSession userSession;
        0wc A012;
        String str;
        User user2 = user;
        if (this.A00 != 0) {
            LEE lee = (LEE) this.A01;
            C60196JhF jhF = (C60196JhF) lee.A08.getValue();
            Editable text = lee.A02.getText();
            0qQ.A07(text);
            if (!user.A2G()) {
                C66169MGg.A01(user, jhF, C318116oQ.A00(jhF), 22);
                userSession = jhF.A02;
                A012 = AnonymousClass0kN.A01(jhF.A01, userSession);
                str = "live_comments";
            } else {
                int[] iArr = AnonymousClass91M.A02;
                CharSequence A05 = AnonymousClass91M.A05(Selection.getSelectionEnd(text) - 1, text);
                String username = user.getUsername();
                if (A05 != null) {
                    int length = text.length();
                    Pattern pattern = 0mp.A00;
                    if ((length + username.length()) - A05.length() < 200) {
                        AnonymousClass7TE.A1Z(new C66173MGk(user2, jhF, username, (AnonymousClass4D7) null, 20), C318116oQ.A00(jhF));
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            C64876Ljc ljc = (C64876Ljc) this.A01;
            C60319JjN A002 = C64876Ljc.A00(ljc);
            int selectionEnd = ljc.A05.getSelectionEnd();
            if (!user.A2G()) {
                C60319JjN.A02(new C61739KKe(user), A002);
                userSession = A002.A02.A01;
                A012 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
                str = "story";
            } else {
                C60319JjN.A01(DbS.A0C(((C61051Jvp) A002.A07.getValue()).A01), A002, user, selectionEnd);
                return;
            }
        }
        C49241Erk.A00(A012, userSession, user2, str, "click", AnonymousClass000.A00(84));
    }

    public final /* synthetic */ void DIN(C387339m3 r1) {
    }
}
