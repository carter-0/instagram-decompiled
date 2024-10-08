package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UiX  reason: case insensitive filesystem */
public final class C15788UiX extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final VOO A03;

    public C15788UiX(Context context, AnonymousClass0iw r3, UserSession userSession, VOO voo) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = voo;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        UserSession userSession = this.A02;
        return new UEG(DbT.A0D(layoutInflater, viewGroup, R.layout.row_places_map, false), this.A01, userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r23, X.C249703kE r24) {
        /*
            r22 = this;
            r10 = r24
            r3 = r23
            X.WSr r3 = (X.C19283WSr) r3
            X.UEG r10 = (X.UEG) r10
            r9 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r9, r3, r10)
            com.instagram.model.venue.Venue r8 = r3.A02
            java.lang.Double r1 = r8.A00()
            java.lang.Double r0 = r8.A01()
            if (r1 == 0) goto L_0x01b1
            if (r0 == 0) goto L_0x01b1
            r5 = r22
            android.content.Context r2 = r5.A00
            com.instagram.common.session.UserSession r7 = r5.A02
            boolean r1 = r3.A03
            com.instagram.common.typedurl.ImageUrl r0 = r3.A00
            r21 = r0
            X.UXv r11 = r3.A01
            X.VOO r0 = r5.A03
            r17 = r0
            X.0qQ.A0A(r17)
            X.0qQ.A0B(r2, r9)
            X.0qQ.A0B(r7, r4)
            r6 = 0
            if (r11 == 0) goto L_0x009b
            java.lang.String r14 = r11.A05
            X.0qQ.A07(r14)
            int r13 = r14.length()
            int r13 = r13 - r4
            r12 = 0
            r3 = 0
        L_0x0045:
            r5 = 32
            if (r12 > r13) goto L_0x005f
            r0 = r13
            if (r3 != 0) goto L_0x004d
            r0 = r12
        L_0x004d:
            boolean r0 = X.Dbb.A1a(r14, r0)
            if (r3 != 0) goto L_0x005a
            if (r0 != 0) goto L_0x0057
            r3 = 1
            goto L_0x0045
        L_0x0057:
            int r12 = r12 + 1
            goto L_0x0045
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            int r13 = r13 + -1
            goto L_0x0045
        L_0x005f:
            java.lang.String r3 = X.Dba.A0c(r14, r13, r12)
            java.lang.String r0 = r11.A07
            java.lang.String r12 = X.002.A0T(r3, r0, r5)
            int r5 = r12.length()
            int r5 = r5 - r4
            r4 = 0
            r3 = 0
        L_0x0070:
            if (r4 > r5) goto L_0x0088
            r0 = r5
            if (r3 != 0) goto L_0x0076
            r0 = r4
        L_0x0076:
            boolean r0 = X.Dbb.A1a(r12, r0)
            if (r3 != 0) goto L_0x0083
            if (r0 != 0) goto L_0x0080
            r3 = 1
            goto L_0x0070
        L_0x0080:
            int r4 = r4 + 1
            goto L_0x0070
        L_0x0083:
            if (r0 == 0) goto L_0x0088
            int r5 = r5 + -1
            goto L_0x0070
        L_0x0088:
            java.lang.String r19 = X.Dba.A0c(r12, r5, r4)
            if (r19 == 0) goto L_0x009d
            int r0 = r19.length()
            if (r0 == 0) goto L_0x009d
            com.instagram.model.venue.LocationDictIntf r0 = r8.A00
            java.lang.String r19 = r0.getName()
            goto L_0x009d
        L_0x009b:
            r19 = r6
        L_0x009d:
            X.U4m r0 = r10.A02
            X.WFS r12 = new X.WFS
            r18 = r8
            r20 = r1
            r13 = r2
            r14 = r21
            r15 = r10
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A0G(r12)
            if (r11 == 0) goto L_0x01bf
            java.lang.String r14 = r11.A06
            java.lang.Integer r13 = r11.A03
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r1 = r11.A01
        L_0x00b9:
            X.WnA r12 = new X.WnA
            r0 = r17
            r12.<init>(r0, r8)
            if (r1 == 0) goto L_0x01bc
            java.lang.String r6 = r1.A01
            java.lang.String r15 = r1.A02
        L_0x00c6:
            com.instagram.common.ui.base.IgTextView r5 = r10.A04
            r4 = 7
            android.content.Context r3 = X.JTP.A0C(r5, r4)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131966733(0x7f133b0d, float:1.9570312E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r1, r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            if (r14 != 0) goto L_0x00f2
            com.instagram.model.venue.LocationDictIntf r14 = r8.A00
            java.lang.String r14 = r14.getCategory()
            if (r14 == 0) goto L_0x00f5
            com.instagram.model.venue.LocationDictIntf r14 = r8.A00
            java.lang.String r14 = r14.getCategory()
        L_0x00f2:
            r0.append(r14)
        L_0x00f5:
            X.0eM r14 = X.0mp.A09
            java.lang.String r14 = " • "
            if (r13 == 0) goto L_0x0111
            int r13 = r13.intValue()
            if (r13 <= 0) goto L_0x0111
            int r16 = r0.length()
            if (r16 <= 0) goto L_0x010a
            r0.append(r14)
        L_0x010a:
            android.text.SpannableString r13 = X.C18792W1y.A00(r3, r7, r13)
            r0.append(r13)
        L_0x0111:
            r1.append(r0)
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>()
            java.lang.String r0 = "LOCATION_INFO_BLOCK_BINDER"
            java.lang.String r0 = X.C18792W1y.A02(r3, r7, r8, r0)
            X.0qQ.A07(r0)
            int r7 = r0.length()
            boolean r16 = X.AnonymousClass7TF.A1Q(r7)
            java.lang.String r7 = "\n"
            if (r16 != 0) goto L_0x013a
            int r16 = r1.length()
            if (r16 <= 0) goto L_0x0137
            r13.append(r7)
        L_0x0137:
            r13.append(r0)
        L_0x013a:
            if (r15 == 0) goto L_0x015e
            int r0 = r15.length()
            if (r0 == 0) goto L_0x015e
            if (r6 == 0) goto L_0x015e
            int r0 = r6.length()
            if (r0 == 0) goto L_0x015e
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x01b2
            r13.append(r14)
        L_0x0153:
            r13.append(r6)
            java.lang.String r0 = " "
            r13.append(r0)
            r13.append(r15)
        L_0x015e:
            r1.append(r13)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r0 = 52
            X.WBA.A00(r5, r0, r12)
            r1.append(r6)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x017c
            r1.append(r7)
        L_0x017c:
            r6.append(r2)
            r2 = 3
            X.U2H r0 = new X.U2H
            r0.<init>(r2, r12, r3)
            X.C51971G9r.A0y(r6, r0, r9)
            r1.append(r6)
            android.text.method.LinkMovementMethod r0 = new android.text.method.LinkMovementMethod
            r0.<init>()
            r5.setMovementMethod(r0)
            r5.setText(r1)
            com.instagram.common.ui.base.IgTextView r2 = r10.A03
            X.WBF r0 = new X.WBF
            r3 = r0
            r5 = r8
            r6 = r11
            r7 = r17
            r8 = r21
            r3.<init>((int) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8)
            X.AnonymousClass0fU.A00(r0, r2)
            android.content.Context r1 = r2.getContext()
            r0 = 2131961869(0x7f13280d, float:1.9560447E38)
            X.C66581MXm.A15(r1, r2, r0)
        L_0x01b1:
            return
        L_0x01b2:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0153
            r13.append(r7)
            goto L_0x0153
        L_0x01bc:
            r15 = r6
            goto L_0x00c6
        L_0x01bf:
            r14 = r6
            r13 = r6
            r1 = r6
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15788UiX.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C19283WSr.class;
    }
}
