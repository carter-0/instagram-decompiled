package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.U9y  reason: case insensitive filesystem */
public final class C14803U9y extends 2Rw {
    public WSO A00;
    public String A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14888UDq(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.media_list_section_item, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r20, int r21) {
        /*
            r19 = this;
            r2 = r20
            X.UDq r2 = (X.C14888UDq) r2
            r3 = 0
            X.0qQ.A0B(r2, r3)
            r1 = r19
            X.WSO r0 = r1.A00
            X.0qQ.A0A(r0)
            X.Jvt r0 = r0.A00
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            r4 = r21
            java.lang.Object r4 = r0.get(r4)
            X.WSN r4 = (X.WSN) r4
            X.UKu r5 = r4.A00
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r5.A00
            if (r7 == 0) goto L_0x0030
            X.0eM r0 = r2.A04
            java.lang.Object r6 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = (com.instagram.common.ui.widget.imageview.IgImageView) r6
            X.0iw r0 = r1.A02
            r6.setUrl(r7, r0)
        L_0x0030:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x00fc
            X.0eM r7 = r2.A04
            java.lang.Object r6 = X.AnonymousClass7TE.A14(r7)
            com.instagram.igds.components.imagebutton.IgImageButton r6 = (com.instagram.igds.components.imagebutton.IgImageButton) r6
            X.6uM r0 = X.C321546uM.A08
        L_0x003e:
            r6.setIcon(r0)
        L_0x0041:
            android.view.View r6 = X.AnonymousClass7TH.A06(r7)
            r0 = 47
            X.WBC.A00(r6, r0, r4)
            android.view.View r6 = X.AnonymousClass7TH.A06(r7)
            android.view.View r0 = X.AnonymousClass7TH.A06(r7)
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.session.UserSession r10 = r1.A03
            r11 = 0
            android.view.View r0 = X.AnonymousClass7TH.A06(r7)
            android.content.res.Resources r9 = X.C66580MXl.A0B(r0)
            java.lang.String r15 = r5.A05
            java.lang.String r7 = r5.A04
            java.lang.Integer r14 = r5.A03
            X.3VA r13 = r5.A02
            X.0iw r0 = r1.A02
            java.lang.String r17 = r0.getModuleName()
            r12 = r11
            r18 = r3
            r16 = r7
            java.lang.StringBuilder r0 = X.C246673ez.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6.setContentDescription(r0)
            X.WSO r0 = r1.A00
            X.0qQ.A0A(r0)
            X.Jvt r0 = r0.A00
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00f4
            r1 = 64
            java.lang.String r0 = r5.A06
            java.lang.String r6 = X.002.A0D(r0, r1)
            X.3oV r1 = r2.A02
            r1.setVisibility(r3)
            android.widget.TextView r0 = r2.A01
            if (r0 == 0) goto L_0x009a
            r0.setText(r6)
        L_0x009a:
            android.widget.TextView r0 = r2.A00
            if (r0 == 0) goto L_0x00a1
            r0.setText(r6)
        L_0x00a1:
            android.view.View r1 = r1.getView()
            r0 = 46
            X.WBC.A00(r1, r0, r4)
        L_0x00aa:
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x00d2
            X.3oV r4 = r2.A03
            r4.setVisibility(r3)
            android.view.View r3 = r4.getView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.1iA r2 = r5.A01
            X.1iA r1 = X.1iA.A0Q
            r0 = 2131962265(0x7f132999, float:1.956125E38)
            if (r2 != r1) goto L_0x00c5
            r0 = 2131962239(0x7f13297f, float:1.9561198E38)
        L_0x00c5:
            r3.setText(r0)
            android.view.View r1 = r4.getView()
            X.WAy r0 = X.C18886WAy.A00
        L_0x00ce:
            X.AnonymousClass0fU.A00(r0, r1)
            return
        L_0x00d2:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0111
            X.3oV r4 = r2.A03
            r4.setVisibility(r3)
            android.view.View r3 = r4.getView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r2 = X.DbS.A07(r2)
            r1 = 2131962229(0x7f132975, float:1.9561177E38)
            java.lang.String r0 = r5.A06
            X.DbX.A13(r2, r3, r0, r1)
            android.view.View r1 = r4.getView()
            X.WAx r0 = X.C18885WAx.A00
            goto L_0x00ce
        L_0x00f4:
            X.3oV r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00aa
        L_0x00fc:
            boolean r0 = r5.A08
            X.0eM r7 = r2.A04
            java.lang.Object r6 = X.AnonymousClass7TE.A14(r7)
            com.instagram.igds.components.imagebutton.IgImageButton r6 = (com.instagram.igds.components.imagebutton.IgImageButton) r6
            if (r0 == 0) goto L_0x010c
            X.6uM r0 = X.C321546uM.A0N
            goto L_0x003e
        L_0x010c:
            r6.A0H()
            goto L_0x0041
        L_0x0111:
            X.3oV r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14803U9y.onBindViewHolder(X.3kE, int):void");
    }

    public C14803U9y(AnonymousClass0iw r1, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = r1;
    }

    public final int getItemCount() {
        int size;
        int A032 = AnonymousClass0fD.A03(-61175192);
        WSO wso = this.A00;
        if (wso == null) {
            size = 0;
        } else {
            size = ((List) wso.A00.A00).size();
        }
        AnonymousClass0fD.A0A(292832301, A032);
        return size;
    }
}
