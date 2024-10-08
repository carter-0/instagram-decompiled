package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Udd  reason: case insensitive filesystem */
public final class C15488Udd extends 2Ru implements C231272rL {
    public C14198Trd A00 = C14448TwW.A00();
    public final Context A01;
    public final C61484K9p A02;
    public final C15541UeU A03;
    public final C15536UeP A04;
    public final C15537UeQ A05;
    public final C68506NLd A06;
    public final C14407Tva A07;
    public final NLH A08;
    public final C46437Dez A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15488Udd(Context context, AnonymousClass0iw r22, UserSession userSession, C14407Tva tva, C15398Uc1 uc1, boolean z, boolean z2, boolean z3, boolean z4) {
        super(false);
        UserSession userSession2 = userSession;
        boolean A1Y = DbW.A1Y(userSession2);
        Context context2 = context;
        this.A01 = context2;
        this.A07 = tva;
        XAH xah = XAH.A01;
        AnonymousClass0iw r8 = r22;
        C15398Uc1 uc12 = uc1;
        C15541UeU ueU = new C15541UeU(context2, r8, userSession2, uc12, xah);
        this.A03 = ueU;
        C15537UeQ ueQ = new C15537UeQ(context2, r8, uc12, xah);
        this.A05 = ueQ;
        C68506NLd nLd = new C68506NLd(context2, r8, userSession2, uc12, xah, (Integer) null, (String) null, false, false, false, A1Y, A1Y, A1Y);
        this.A06 = nLd;
        C15536UeP ueP = new C15536UeP(context2, uc12, xah, z4);
        this.A04 = ueP;
        C61484K9p k9p = new C61484K9p(userSession2, uc12, new C19552Wbc(this), xah, z, z2, z3);
        this.A02 = k9p;
        C46437Dez dez = new C46437Dez(context2);
        this.A09 = dez;
        NLH nlh = new NLH(uc12);
        this.A08 = nlh;
        init(new C231642s0[]{ueU, ueQ, nLd, ueP, k9p, dez, nlh});
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A00() {
        C231642s0 r0;
        clear();
        if (this.A00.A00.size() == 0) {
            Context context = this.A01;
            int i = 2131968424;
            if (this.A07 == C14407Tva.USERS) {
                i = 2131968383;
            }
            addModel(context.getString(i), this.A09);
        } else {
            int size = this.A00.A00.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = this.A00.A00.get(i2);
                Object obj2 = this.A00.A01.get(i2);
                if (C61069Jw7.A00(3, obj)) {
                    0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchTitleState");
                    r0 = this.A08;
                } else {
                    boolean z = obj instanceof C66632Ma1;
                    String A002 = C66579MXk.A00(17);
                    if (z) {
                        0qQ.A0C(obj2, A002);
                        r0 = this.A06;
                    } else if (obj instanceof C69160Nfj) {
                        0qQ.A0C(obj2, A002);
                        r0 = this.A03;
                    } else if (obj instanceof C69158Nfh) {
                        0qQ.A0C(obj2, A002);
                        r0 = this.A05;
                    } else if (obj instanceof C67387Mn4) {
                        0qQ.A0C(obj2, A002);
                        r0 = this.A04;
                    } else if (obj instanceof C69159Nfi) {
                        0qQ.A0C(obj2, A002);
                        r0 = this.A02;
                    } else {
                        throw DbW.A0c(Pxf.A0g(obj), " not supported for edit search history");
                    }
                }
                addModel(obj, obj2, r0);
            }
        }
        notifyDataSetChanged();
    }
}
