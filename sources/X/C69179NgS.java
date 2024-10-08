package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.NgS  reason: case insensitive filesystem */
public final class C69179NgS extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorAgentThreadSettingsDetailFragment";
    public 2da A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new GW6(this, 5));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        0qQ.A0B(layoutInflater, 0);
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) C71465Ol7.A00, (CharSequence) "", false);
        setItems(AnonymousClass7TE.A1I(pr9));
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(viewLifecycleOwner, pr9, r4, this, (AnonymousClass4D7) null, 14), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return "creator_agent_thread_settings_thread_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public C69179NgS() {
        GW6 gw6 = new GW6(this, 9);
        GW6 gw62 = new GW6(this, 6);
        0eO r2 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, new GW6(gw62, 7));
        this.A06 = DbS.A0I(new GW6(A002, 8), gw6, new C73664Phd(4, A002, (Object) null), DbS.A0z(C67733Mtm.class));
        this.A01 = C51804G2n.A01(this, "is_enabled_map", r2, 9);
        this.A03 = C51804G2n.A01(this, AnonymousClass000.A00(1663), r2, 10);
        this.A05 = C51804G2n.A01(this, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r2, 11);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(((C68173N3o) ((C67733Mtm) this.A06.getValue()).A06.getValue()).A01);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r10 == false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -1326124388(0xffffffffb0f4f29c, float:-1.782229E-9)
            int r2 = X.AnonymousClass0fD.A02(r0)
            super.onCreate(r12)
            X.0eM r0 = r11.A06
            java.lang.Object r4 = r0.getValue()
            X.Mtm r4 = (X.C67733Mtm) r4
            java.util.Map r6 = r4.A04
            java.util.Collection r1 = r6.values()
            r8 = 0
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x007d
        L_0x0021:
            r9 = 1
        L_0x0022:
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r4.A00
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.6oA r5 = r4.A01
            boolean r10 = r0.CQp(r5)
            com.instagram.user.model.User r3 = r4.A02
            java.lang.String r0 = r3.getId()
            java.lang.Object r0 = r6.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = X.AnonymousClass7TG.A1X(r0)
            boolean r0 = r3.CQp(r5)
            if (r1 != 0) goto L_0x006d
            r6 = 2131952633(0x7f1303f9, float:1.9541714E38)
            if (r10 != 0) goto L_0x0077
        L_0x004b:
            X.05G r1 = r4.A05
        L_0x004d:
            java.lang.Object r0 = r1.getValue()
            java.lang.String r5 = X.AnonymousClass50n.A07(r3)
            X.0qQ.A07(r5)
            r7 = 2131953360(0x7f1306d0, float:1.9543189E38)
            X.N3o r4 = new X.N3o
            r4.<init>(r5, r6, r7, r8, r9, r10)
            boolean r0 = r1.AIY(r0, r4)
            if (r0 == 0) goto L_0x004d
            r0 = -1981233111(0xffffffff89e8c829, float:-5.6040198E-33)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x006d:
            if (r10 == 0) goto L_0x0079
            r6 = 2131953359(0x7f1306cf, float:1.9543187E38)
            if (r0 == 0) goto L_0x0077
            r6 = 2131952634(0x7f1303fa, float:1.9541716E38)
        L_0x0077:
            r8 = 1
            goto L_0x004b
        L_0x0079:
            r6 = 2131952635(0x7f1303fb, float:1.9541718E38)
            goto L_0x0077
        L_0x007d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0081
            r9 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69179NgS.onCreate(android.os.Bundle):void");
    }
}
