package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Ky  reason: invalid class name and case insensitive filesystem */
public final class C306146Ky extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceFragmentV2";
    public Drawable A00;
    public Drawable A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public EditText A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public C66425MRf A0P;
    public C18643Vvl A0Q;
    public C18620VvD A0R;
    public final AnonymousClass0eM A0S = C227642jf.A02(this);
    public final AnonymousClass0eM A0T = AnonymousClass0eN.A01(new C20702WxZ(this, 7));
    public final AnonymousClass0eM A0U = new C227862kA(new C20702WxZ(this, 8), new C20702WxZ(this, 9), new C41566AwY(21, (Object) null, this), new 0Yh(U92.class));

    public final void configureActionBar(2da r4) {
        C18643Vvl vvl;
        0qQ.A0B(r4, 0);
        int i = 2131970342;
        if (A01(this).A04 != null) {
            i = 2131970470;
        }
        r4.Eom(i);
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A00();
        r4.ErG(new AnonymousClass3Jb(r1));
        Context context = getContext();
        if (context != null) {
            vvl = new C18643Vvl(context, r4);
        } else {
            vvl = null;
        }
        this.A0Q = vvl;
        if (vvl != null) {
            vvl.A01(new W8K(this), AnonymousClass05K.A1F);
        }
        C18643Vvl vvl2 = this.A0Q;
        if (vvl2 != null) {
            vvl2.A02(true);
        }
    }

    public final String getModuleName() {
        return "promote_create_audience";
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, X.6Ky, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x044b, code lost:
        if (X.C18803W2r.A06((com.instagram.common.session.UserSession) r2.getValue()) != false) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0466, code lost:
        if (r1.A0A != false) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0468, code lost:
        if (r4 != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04b6, code lost:
        if (r0.isEmpty() == false) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x050d, code lost:
        if (r0.isEmpty() == false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        if (r1.A0A != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0184, code lost:
        if (r1.A0A != false) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r3 = 0
            X.0qQ.A0B(r9, r3)
            super.onViewCreated(r9, r10)
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()
            if (r1 == 0) goto L_0x001d
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r1 = r1.findViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = (com.instagram.ui.widget.spinner.SpinnerImageView) r1
            if (r1 == 0) goto L_0x001d
            X.3uy r0 = X.C255943uy.SUCCESS
            r1.setLoadingStatus(r0)
        L_0x001d:
            android.view.View r0 = r8.A09
            if (r0 != 0) goto L_0x0030
            r0 = 2131435794(0x7f0b2112, float:1.849344E38)
            android.view.View r0 = r9.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            r8.A09 = r0
        L_0x0030:
            android.content.Context r2 = r8.getContext()
            r4 = 0
            if (r2 == 0) goto L_0x0519
            r0 = 2131238258(0x7f081d72, float:1.809279E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x0519
            int r0 = X.2Yu.A03(r2)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
        L_0x004f:
            r8.A01 = r1
            android.content.Context r2 = r8.getContext()
            if (r2 == 0) goto L_0x0073
            r0 = 2131238106(0x7f081cda, float:1.8092481E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x0073
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            r4 = r1
        L_0x0073:
            r8.A00 = r4
            android.view.View r1 = r8.A09
            if (r1 == 0) goto L_0x00ad
            r0 = 2131428238(0x7f0b038e, float:1.8478115E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x00ad
            r0 = 2131428218(0x7f0b037a, float:1.8478074E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A0F = r0
            r0 = 2131441756(0x7f0b385c, float:1.8505533E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r8.A0C = r0
            r0 = 2131428217(0x7f0b0379, float:1.8478072E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r8.A0B = r1
            if (r1 == 0) goto L_0x00ad
            X.W7h r0 = new X.W7h
            r0.<init>(r8)
            r1.addTextChangedListener(r0)
        L_0x00ad:
            android.view.View r1 = r8.A09
            if (r1 == 0) goto L_0x00e2
            r0 = 2131435695(0x7f0b20af, float:1.849324E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x00e2
            r0 = 2131440547(0x7f0b33a3, float:1.850308E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A0M = r0
            r0 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A0L = r0
            android.widget.TextView r1 = r8.A0M
            if (r1 == 0) goto L_0x00da
            r0 = 2131970333(0x7f13491d, float:1.9577614E38)
            r1.setText(r0)
        L_0x00da:
            X.W8P r0 = new X.W8P
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x00e2:
            android.view.View r1 = r8.A09
            r4 = 0
            if (r1 == 0) goto L_0x0516
            r0 = 2131434985(0x7f0b1de9, float:1.84918E38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x00ee:
            r8.A06 = r0
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x0513
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r6 = r0.Aa9()
        L_0x0100:
            android.view.View r2 = r8.A06
            if (r2 == 0) goto L_0x0132
            X.U92 r0 = A01(r8)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A00
            com.instagram.api.schemas.XIGIGBoostDestination r5 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r0 != r5) goto L_0x011a
            X.U92 r1 = A01(r8)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A00
            if (r0 != r5) goto L_0x04fd
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x04fd
        L_0x011a:
            if (r6 == 0) goto L_0x012e
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.OFF
            if (r6 == r0) goto L_0x012e
            X.0eM r0 = r8.A0S
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.C18803W2r.A06(r0)
            if (r0 != 0) goto L_0x050f
        L_0x012e:
            r0 = 0
        L_0x012f:
            r2.setVisibility(r0)
        L_0x0132:
            android.view.View r1 = r8.A06
            if (r1 == 0) goto L_0x0166
            r0 = 2131434984(0x7f0b1de8, float:1.8491797E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x0166
            r0 = 2131440547(0x7f0b33a3, float:1.850308E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0151
            r0 = 2131970316(0x7f13490c, float:1.957758E38)
            r1.setText(r0)
            r4 = r1
        L_0x0151:
            r8.A0J = r4
            r0 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A0H = r0
            X.W8N r0 = new X.W8N
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x0166:
            X.U92 r0 = A01(r8)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A00
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            if (r1 == r0) goto L_0x0186
            X.U92 r0 = A01(r8)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A00
            com.instagram.api.schemas.XIGIGBoostDestination r2 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r0 != r2) goto L_0x01b4
            X.U92 r1 = A01(r8)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A00
            if (r0 != r2) goto L_0x01b4
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x01b4
        L_0x0186:
            android.view.View r1 = r8.A09
            if (r1 == 0) goto L_0x01b4
            r0 = 2131434977(0x7f0b1de1, float:1.8491783E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x01b4
            X.9F0 r2 = X.C375769Ez.A00
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            X.0eM r0 = r8.A0S
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            android.text.SpannableStringBuilder r0 = r2.A06(r1, r0)
            r4.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r4.setMovementMethod(r0)
            r4.setVisibility(r3)
        L_0x01b4:
            android.view.View r2 = r8.A09
            r0 = 0
            if (r2 == 0) goto L_0x04fa
            r1 = 2131427849(0x7f0b0209, float:1.8477326E38)
            android.view.View r2 = r2.findViewById(r1)
        L_0x01c0:
            r8.A02 = r2
            if (r2 == 0) goto L_0x01cc
            X.W8L r1 = new X.W8L
            r1.<init>(r8)
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x01cc:
            android.view.View r2 = r8.A02
            if (r2 == 0) goto L_0x04f7
            r1 = 2131440547(0x7f0b33a3, float:1.850308E38)
            android.view.View r2 = r2.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x04f7
            r1 = 2131970308(0x7f134904, float:1.9577563E38)
            r2.setText(r1)
        L_0x01e1:
            r8.A0E = r2
            android.view.View r1 = r8.A02
            if (r1 == 0) goto L_0x01f0
            r0 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x01f0:
            r8.A0D = r0
            boolean r0 = A03(r8)
            android.view.View r1 = r8.A02
            if (r0 == 0) goto L_0x04f2
            if (r1 == 0) goto L_0x0201
            r0 = 8
        L_0x01fe:
            r1.setVisibility(r0)
        L_0x0201:
            android.view.View r1 = r8.A09
            if (r1 == 0) goto L_0x0221
            r0 = 2131428240(0x7f0b0390, float:1.8478119E38)
            android.view.View r4 = r1.findViewById(r0)
            if (r4 == 0) goto L_0x0221
            X.0eM r0 = r8.A0S
            java.lang.Object r2 = r0.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()
            X.VvD r0 = new X.VvD
            r0.<init>(r2, r1, r4)
            r8.A0R = r0
        L_0x0221:
            android.view.View r1 = r8.A09
            if (r1 == 0) goto L_0x0298
            r0 = 2131427825(0x7f0b01f1, float:1.8477277E38)
            android.view.View r5 = r1.findViewById(r0)
            if (r5 == 0) goto L_0x0298
            X.0eM r0 = r8.A0S
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.C18803W2r.A06(r0)
            if (r0 == 0) goto L_0x04ee
            r0 = 2131427817(0x7f0b01e9, float:1.847726E38)
            android.view.View r6 = r5.requireViewById(r0)
            X.0qQ.A07(r6)
            com.instagram.igds.components.switchbutton.IgdsSwitch r6 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r6
            X.U92 r0 = A01(r8)
            java.lang.String r1 = r0.A04
            r0 = 0
            if (r1 == 0) goto L_0x0252
            r0 = 1
        L_0x0252:
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L_0x026b
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x04eb
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.Aa9()
        L_0x0266:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r1 == r0) goto L_0x026b
            r2 = 0
        L_0x026b:
            r6.setChecked(r2)
            X.U92 r1 = A01(r8)
            boolean r0 = r6.isChecked()
            if (r0 == 0) goto L_0x04e7
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
        L_0x027a:
            r1.A0C(r0)
            X.WYM r0 = new X.WYM
            r0.<init>(r8)
            r6.A07 = r0
            X.WGU r2 = A00(r8)
            X.U92 r0 = A01(r8)
            X.UzE r1 = r0.A08()
            java.lang.String r0 = "adv_audience_toggle"
            r2.A0H(r1, r0)
        L_0x0295:
            r5.setVisibility(r4)
        L_0x0298:
            android.view.View r1 = r8.A09
            r4 = 0
            if (r1 == 0) goto L_0x04e4
            r0 = 2131436366(0x7f0b234e, float:1.84946E38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x02a4:
            r8.A0A = r0
            X.0eM r2 = r8.A0S
            java.lang.Object r0 = r2.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.C18803W2r.A06(r0)
            if (r0 == 0) goto L_0x0314
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x04e1
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.Aa9()
        L_0x02c4:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r1 != r0) goto L_0x04d6
            X.WGU r5 = A00(r8)
            X.U92 r0 = A01(r8)
            X.UzE r1 = r0.A08()
            java.lang.String r0 = "minimum_age_constraint"
            r5.A0H(r1, r0)
            android.view.View r0 = r8.A0A
            if (r0 == 0) goto L_0x02e0
            r0.setVisibility(r3)
        L_0x02e0:
            android.view.View r1 = r8.A0A
            if (r1 == 0) goto L_0x04d3
            r0 = 2131440547(0x7f0b33a3, float:1.850308E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x02ed:
            r8.A0O = r0
            android.view.View r1 = r8.A0A
            if (r1 == 0) goto L_0x02fc
            r0 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x02fc:
            r8.A0N = r4
            android.widget.TextView r1 = r8.A0O
            if (r1 == 0) goto L_0x0308
            r0 = 2131970351(0x7f13492f, float:1.957765E38)
            r1.setText(r0)
        L_0x0308:
            android.view.View r1 = r8.A0A
            if (r1 == 0) goto L_0x0314
            X.W8Q r0 = new X.W8Q
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0314:
            android.view.View r1 = r8.A09
            r6 = 0
            if (r1 == 0) goto L_0x04d0
            r0 = 2131428249(0x7f0b0399, float:1.8478137E38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x0320:
            r8.A03 = r0
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x04cd
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = r0.Aa9()
        L_0x0332:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r4 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            r5 = 0
            r1 = 8
            if (r0 != r4) goto L_0x04c4
            java.lang.Object r0 = r2.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.C18803W2r.A06(r0)
            if (r0 == 0) goto L_0x04c4
            X.WGU r7 = A00(r8)
            X.U92 r0 = A01(r8)
            X.UzE r1 = r0.A08()
            java.lang.String r0 = "optional_suggestions"
            r7.A0H(r1, r0)
            android.view.View r0 = r8.A03
            if (r0 == 0) goto L_0x035d
            r0.setVisibility(r3)
        L_0x035d:
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L_0x04c1
            r0 = 2131428250(0x7f0b039a, float:1.847814E38)
            android.view.View r7 = r1.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
        L_0x036a:
            r8.A0G = r7
            if (r7 == 0) goto L_0x038b
            android.content.Context r3 = r8.requireContext()
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            boolean r1 = r0.A09
            r0 = 2131970348(0x7f13492c, float:1.9577645E38)
            if (r1 == 0) goto L_0x0384
            r0 = 2131970346(0x7f13492a, float:1.957764E38)
        L_0x0384:
            java.lang.String r0 = r3.getString(r0)
            r7.setText(r0)
        L_0x038b:
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L_0x04be
            r0 = 2131429894(0x7f0b0a06, float:1.8481474E38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x0396:
            r8.A05 = r0
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L_0x03a3
            r0 = 2131429901(0x7f0b0a0d, float:1.8481488E38)
            android.view.View r6 = r1.findViewById(r0)
        L_0x03a3:
            r8.A04 = r6
            android.view.View r3 = r8.A05
            if (r3 == 0) goto L_0x03bd
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            boolean r0 = r0.A09
            r1 = r0 ^ 1
            r0 = 8
            if (r1 == 0) goto L_0x03ba
            r0 = 0
        L_0x03ba:
            r3.setVisibility(r0)
        L_0x03bd:
            android.view.View r1 = r8.A04
            if (r1 == 0) goto L_0x03d2
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x03cf
            r5 = 8
        L_0x03cf:
            r1.setVisibility(r5)
        L_0x03d2:
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L_0x03de
            X.W8M r0 = new X.W8M
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x03de:
            android.view.View r1 = r8.A09
            r6 = 0
            if (r1 == 0) goto L_0x04bb
            r0 = 2131434983(0x7f0b1de7, float:1.8491795E38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x03ea:
            r8.A07 = r0
            android.view.View r1 = r8.A09
            if (r1 == 0) goto L_0x0421
            r0 = 2131434982(0x7f0b1de6, float:1.8491793E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x0421
            r0 = 2131440547(0x7f0b33a3, float:1.850308E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A0K = r0
            r0 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A0I = r0
            android.widget.TextView r1 = r8.A0K
            if (r1 == 0) goto L_0x0419
            r0 = 2131970316(0x7f13490c, float:1.957758E38)
            r1.setText(r0)
        L_0x0419:
            X.W8O r0 = new X.W8O
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x0421:
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x0431
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r6 = r0.Aa9()
        L_0x0431:
            r5 = 0
            if (r6 != r4) goto L_0x044d
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x044d
            java.lang.Object r0 = r2.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.C18803W2r.A06(r0)
            r4 = 1
            if (r0 != 0) goto L_0x044e
        L_0x044d:
            r4 = 0
        L_0x044e:
            android.view.View r3 = r8.A07
            if (r3 == 0) goto L_0x046d
            X.U92 r0 = A01(r8)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A00
            com.instagram.api.schemas.XIGIGBoostDestination r2 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r0 != r2) goto L_0x0468
            X.U92 r1 = A01(r8)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A00
            if (r0 != r2) goto L_0x04a6
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x04a6
        L_0x0468:
            if (r4 == 0) goto L_0x04b8
        L_0x046a:
            r3.setVisibility(r5)
        L_0x046d:
            X.07V r0 = r8.getLifecycle()
            X.0xx r2 = X.C71772f0.A00(r0)
            r4 = 0
            r1 = 6
            X.MG7 r0 = new X.MG7
            r0.<init>(r8, r4, r1)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r0, r2)
            X.07V r0 = r8.getLifecycle()
            X.0xx r2 = X.C71772f0.A00(r0)
            r1 = 7
            X.MG7 r0 = new X.MG7
            r0.<init>(r8, r4, r1)
            X.1Eo.A05(r3, r0, r2)
            X.WGU r1 = A00(r8)
            X.U92 r0 = A01(r8)
            X.UzE r0 = r0.A08()
            java.lang.String r0 = r0.toString()
            r1.A0Q(r0)
            return
        L_0x04a6:
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x04b8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0468
        L_0x04b8:
            r5 = 8
            goto L_0x046a
        L_0x04bb:
            r0 = r6
            goto L_0x03ea
        L_0x04be:
            r0 = r6
            goto L_0x0396
        L_0x04c1:
            r7 = r6
            goto L_0x036a
        L_0x04c4:
            android.view.View r0 = r8.A03
            if (r0 == 0) goto L_0x035d
            r0.setVisibility(r1)
            goto L_0x035d
        L_0x04cd:
            r0 = r6
            goto L_0x0332
        L_0x04d0:
            r0 = r6
            goto L_0x0320
        L_0x04d3:
            r0 = r4
            goto L_0x02ed
        L_0x04d6:
            android.view.View r1 = r8.A0A
            if (r1 == 0) goto L_0x02e0
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x02e0
        L_0x04e1:
            r1 = r4
            goto L_0x02c4
        L_0x04e4:
            r0 = r4
            goto L_0x02a4
        L_0x04e7:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.OFF
            goto L_0x027a
        L_0x04eb:
            r1 = 0
            goto L_0x0266
        L_0x04ee:
            r4 = 8
            goto L_0x0295
        L_0x04f2:
            if (r1 == 0) goto L_0x0201
            r0 = 0
            goto L_0x01fe
        L_0x04f7:
            r2 = r0
            goto L_0x01e1
        L_0x04fa:
            r2 = r0
            goto L_0x01c0
        L_0x04fd:
            X.U92 r0 = A01(r8)
            X.ULv r0 = r0.A09()
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x050f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011a
        L_0x050f:
            r0 = 8
            goto L_0x012f
        L_0x0513:
            r6 = r4
            goto L_0x0100
        L_0x0516:
            r0 = r4
            goto L_0x00ee
        L_0x0519:
            r1 = r4
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306146Ky.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final WGU A00(C306146Ky r0) {
        Object value = r0.A0T.getValue();
        0qQ.A07(value);
        return (WGU) value;
    }

    public static final U92 A01(C306146Ky r0) {
        return (U92) r0.A0U.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A0S.getValue();
    }

    public static final void A02(SpannableStringBuilder spannableStringBuilder, C306146Ky r8, String str, String str2) {
        String A012 = SQU.A01(r8.requireContext(), str2);
        0qQ.A07(A012);
        AnonymousClass7AV.A04(spannableStringBuilder, new C69192Ngq(r8.requireContext(), (0lg) r8.A0S.getValue(), (OAJ) null, A012, r8.requireContext().getColor(2Yu.A06(r8.getContext()))), str);
    }

    public static final boolean A03(C306146Ky r2) {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        AdvantageAudienceData advantageAudienceData = A01(r2).A09().A02;
        if (advantageAudienceData != null) {
            xFBTargetingAutomationAdvantageAudienceStatus = advantageAudienceData.Aa9();
        } else {
            xFBTargetingAutomationAdvantageAudienceStatus = null;
        }
        if (xFBTargetingAutomationAdvantageAudienceStatus != XFBTargetingAutomationAdvantageAudienceStatus.ON || A01(r2).A09().A09 || !C18803W2r.A06((UserSession) r2.A0S.getValue())) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        1OC A012;
        C587707f viewModelStore;
        int A022 = AnonymousClass0fD.A02(-88961408);
        C306146Ky.super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (viewModelStore = activity.getViewModelStore()) == null)) {
            viewModelStore.A00();
        }
        U92 A013 = A01(this);
        String str = A013.A04;
        if (str != null) {
            UserSession userSession = A013.A03;
            String str2 = WGU.A00(userSession).A03;
            0qQ.A07(str2);
            A012 = W2V.A02(userSession, "", str, str2);
        } else {
            UserSession userSession2 = A013.A03;
            String str3 = A013.A05;
            XIGIGBoostDestination xIGIGBoostDestination = A013.A00;
            if (str3 == null) {
                str3 = "";
            }
            ImmutableList of = ImmutableList.of();
            if (xIGIGBoostDestination == null) {
                xIGIGBoostDestination = XIGIGBoostDestination.UNRECOGNIZED;
            }
            A012 = C18765W0j.A01(xIGIGBoostDestination, userSession2, "", str3, of);
        }
        AnonymousClass11O.A03(C318116oQ.A00(A013), new C61860pz(new MGZ(A013, (AnonymousClass4D7) null, 37), A012.A03(1391975297)));
        AnonymousClass0fD.A09(-870290361, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1100403154);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_view, viewGroup, false);
        AnonymousClass0fD.A09(-1810323074, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-98363383);
        super.onDestroy();
        this.A0P = null;
        AnonymousClass0fD.A09(1319128158, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1639075374);
        super.onDestroyView();
        this.A09 = null;
        C18620VvD vvD = this.A0R;
        if (vvD != null) {
            vvD.A01();
        }
        this.A0R = null;
        this.A01 = null;
        this.A00 = null;
        this.A0B = null;
        this.A0C = null;
        this.A0F = null;
        this.A0M = null;
        this.A0L = null;
        this.A06 = null;
        this.A0J = null;
        this.A0H = null;
        this.A02 = null;
        this.A0E = null;
        this.A0D = null;
        this.A0A = null;
        this.A0O = null;
        this.A0N = null;
        this.A03 = null;
        this.A0G = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0K = null;
        this.A0I = null;
        this.A08 = null;
        AnonymousClass0fD.A09(-688812433, A022);
    }
}
