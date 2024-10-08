package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mol  reason: case insensitive filesystem */
public final class C67491Mol implements C74506Pw1 {
    public C68966Nbt A00;
    public final UserSession A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final 1a8 A04 = C66581MXm.A0P();
    public final AnonymousClass6EZ A05;

    public final void AVo(Map map) {
    }

    public final void Cog(N4G n4g, Map map) {
    }

    public final void Cp2(List list) {
    }

    public final void FIX(Map map) {
    }

    public final void FIm(List list) {
    }

    public final void AOd(List list) {
        C68966Nbt nbt = new C68966Nbt(this.A02, this.A01);
        this.A00 = nbt;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nbt.A05((C254743sy) it.next(), false);
        }
    }

    public final void Cm5(Map map) {
        MYY.A01("markThreadsAsUnread").execute(new C73207PYl(this, map));
    }

    public C67491Mol(Context context, AnonymousClass0iw r3, UserSession userSession) {
        this.A02 = context;
        this.A01 = userSession;
        this.A03 = r3;
        this.A05 = AnonymousClass6EY.A00(userSession, "MsysInboxMultiThreadActionController");
    }

    public final void Coz(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C71031OZi.A01(this.A01).A02(C66647MaG.A00((C254743sy) it.next()));
        }
    }

    public final void Cp7(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C70113NxT.A00(this.A01).A00(C66647MaG.A00((C254743sy) it.next()), -1);
        }
    }

    public final void FIk(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A04.A02(this.A05.A00.A05(C66647MaG.A00((C254743sy) it.next())), PTI.A00);
        }
    }

    public final void FIp(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66647MaG.A0D(this.A01, (C254743sy) it.next());
        }
    }
}
