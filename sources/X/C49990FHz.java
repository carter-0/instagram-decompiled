package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.FHz  reason: case insensitive filesystem */
public final class C49990FHz implements DialogInterface.OnClickListener {
    public final /* synthetic */ C49445Evm A00;
    public final /* synthetic */ E4j A01;

    public C49990FHz(C49445Evm evm, E4j e4j) {
        this.A01 = e4j;
        this.A00 = evm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        E4j e4j = this.A01;
        UserSession userSession = e4j.A04;
        String id = this.A00.A01.getId();
        String str = e4j.A04.A06;
        Bundle A09 = DbY.A09(userSession);
        A09.putString("child_user_id_key", id);
        A09.putString("main_user_id_key", str);
        E58 e58 = new E58();
        C309516Yo A0M = DbS.A0M(DbU.A0I(A09, e58, e4j), e4j.A04);
        A0M.A0C = getClass().getCanonicalName();
        A0M.A0E(e58);
        A0M.A0F(e4j, 0);
        A0M.A04();
    }
}
