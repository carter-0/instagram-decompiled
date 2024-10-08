package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class NdN extends C65356Lrw {
    public final /* synthetic */ C72497P8g A00;
    public final /* synthetic */ 2Dm A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ MessageIdentifier A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;
    public final /* synthetic */ ArrayList A06;
    public final /* synthetic */ HashSet A07;
    public final /* synthetic */ 0r1 A08;
    public final /* synthetic */ boolean A09;

    public NdN(C72497P8g p8g, 2Dm r2, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, HashSet hashSet, 0r1 r9, boolean z) {
        this.A08 = r9;
        this.A04 = arrayList;
        this.A02 = directThreadKey;
        this.A00 = p8g;
        this.A03 = messageIdentifier;
        this.A01 = r2;
        this.A07 = hashSet;
        this.A06 = arrayList2;
        this.A05 = arrayList3;
        this.A09 = z;
    }

    public final void onButtonClick(View view) {
        String str;
        this.A08.A00 = false;
        ArrayList arrayList = this.A04;
        2Dm r2 = this.A01;
        DirectThreadKey directThreadKey = this.A02;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r2.A89(C66580MXl.A0a(it), directThreadKey);
        }
        String str2 = directThreadKey.A00;
        if (str2 != null) {
            C72497P8g p8g = this.A00;
            C331247Qd.A01(p8g.A05, str2, this.A07);
        }
        UserSession userSession = this.A00.A05;
        MessageIdentifier messageIdentifier = this.A03;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(C66580MXl.A0N(new AnonymousClass0kM(userSession), "direct_thread"), "direct_delete_message_undo");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, "undo");
            C66581MXm.A1H(A0e, C66647MaG.A0E(directThreadKey));
            A0e.AAJ("message_id", str);
            C67003Mgb.A02(A0e, directThreadKey);
            A0e.Cgf();
        }
    }

    public final void onDismiss() {
        String str;
        if (this.A08.A00) {
            C72497P8g p8g = this.A00;
            C333537Zi A002 = C333527Zh.A00(p8g.A05);
            C254743sy r3 = (C254743sy) C66580MXl.A0s(p8g.A0s);
            MessageIdentifier messageIdentifier = p8g.A00;
            if (messageIdentifier != null) {
                str = messageIdentifier.A01;
            } else {
                str = null;
            }
            A002.A0L(r3, str, this.A06, this.A05, this.A09);
        }
    }
}
