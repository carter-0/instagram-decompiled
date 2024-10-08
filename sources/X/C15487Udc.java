package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Udc  reason: case insensitive filesystem */
public final class C15487Udc extends 2Ru implements C231272rL {
    public C14198Trd A00 = C14448TwW.A00();
    public final Context A01;
    public final UserSession A02;
    public final C15541UeU A03;
    public final C15530UeJ A04;
    public final C15537UeQ A05;
    public final C66971Mg4 A06;
    public final C46437Dez A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15487Udc(Context context, AnonymousClass0iw r12, UserSession userSession, C15939Ul6 ul6) {
        super(false);
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = context;
        XAH xah = XAH.A01;
        C15541UeU ueU = new C15541UeU(context, r12, userSession, ul6, xah);
        this.A03 = ueU;
        C15537UeQ ueQ = new C15537UeQ(context, r12, ul6, xah);
        this.A05 = ueQ;
        C15530UeJ ueJ = new C15530UeJ(context, ul6, xah);
        this.A04 = ueJ;
        C46437Dez dez = new C46437Dez(context);
        this.A07 = dez;
        C66971Mg4 mg4 = new C66971Mg4(context);
        this.A06 = mg4;
        init(new C231642s0[]{ueU, ueQ, ueJ, dez, mg4});
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A00() {
        C231642s0 r0;
        clear();
        if (this.A00.A00.size() == 0) {
            addModel(this.A01.getString(2131968424), this.A07);
        } else {
            int size = this.A00.A00.size();
            for (int i = 0; i < size; i++) {
                Object obj = this.A00.A00.get(i);
                Object obj2 = this.A00.A01.get(i);
                boolean z = obj instanceof C69160Nfj;
                String A002 = C66579MXk.A00(17);
                if (z) {
                    0qQ.A0C(obj2, A002);
                    r0 = this.A03;
                } else if (obj instanceof C69158Nfh) {
                    0qQ.A0C(obj2, A002);
                    r0 = this.A05;
                } else if (obj instanceof C69156Nff) {
                    0qQ.A0C(obj2, A002);
                    r0 = this.A04;
                } else {
                    throw DbW.A0c(Pxf.A0g(obj), " not supported for edit search history");
                }
                addModel(obj, obj2, r0);
            }
        }
        notifyDataSetChanged();
    }
}
