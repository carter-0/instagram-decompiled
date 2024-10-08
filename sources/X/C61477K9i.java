package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.K9i  reason: case insensitive filesystem */
public final class C61477K9i extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C65634LxB A02;
    public final C363008it A03;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r14 == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r16, android.view.View r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r8 = r18
            r0 = 1016780039(0x3c9ad507, float:0.018900407)
            r2 = r17
            int r4 = X.DbX.A04(r2, r0)
            r1 = 2
            X.0qQ.A0B(r8, r1)
            java.lang.Object r5 = r2.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.YourStoryRowViewBinder.Holder"
            X.0qQ.A0C(r5, r0)
            X.L90 r5 = (X.L90) r5
            com.instagram.common.session.UserSession r7 = r15.A01
            X.0iw r3 = r15.A00
            X.Li5 r8 = (X.C64789Li5) r8
            X.8it r0 = r15.A03
            boolean r14 = r0.A06()
            X.LxB r10 = r15.A02
            r11 = 0
            boolean r9 = X.AnonymousClass7TF.A1U(r11, r5, r7)
            X.0qQ.A0B(r3, r1)
            r6 = 3
            X.DbW.A1N(r8, r6, r10)
            boolean r0 = r8.A01
            boolean r13 = X.AnonymousClass8PU.A0A(r7, r0)
            boolean r12 = X.AnonymousClass8PU.A0B(r7, r0)
            boolean r2 = r8.A02
            if (r2 == 0) goto L_0x00e2
            if (r13 != 0) goto L_0x00d9
            if (r12 != 0) goto L_0x00d9
            android.view.View r1 = r5.A01
            r0 = 0
        L_0x0049:
            X.AnonymousClass0fU.A00(r0, r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r5.A03
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r7)
            X.DbU.A1S(r3, r1, r0)
            com.instagram.igds.components.button.IgdsRadioButton r0 = r5.A04
            r0.setChecked(r2)
            if (r13 == 0) goto L_0x005f
            r0 = 1
            if (r14 != 0) goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            X.Jqo r6 = new X.Jqo
            r6.<init>()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_xpost_enabled"
            r6.A03(r0, r3)
            if (r13 == 0) goto L_0x00a2
            java.lang.Boolean r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0081
            X.818 r2 = X.AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS
            X.JZY r1 = X.JZY.VIEW
            X.JZZ r0 = X.JZZ.STORY
            X.JZX.A00(r1, r0, r2, r6, r7)
        L_0x0081:
            android.widget.TextView r1 = r5.A02
            r1.setVisibility(r11)
            r0 = 2131971391(0x7f134d3f, float:1.957976E38)
            if (r14 == 0) goto L_0x008e
            r0 = 2131971392(0x7f134d40, float:1.9579762E38)
        L_0x008e:
            r1.setText(r0)
            X.KIP r0 = new X.KIP
            r0.<init>(r10, r8, r9)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0099:
            r5.A00 = r3
            r0 = 1384306887(0x5282d8c7, float:2.80991334E11)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x00a2:
            if (r12 == 0) goto L_0x00b0
            android.widget.TextView r1 = r5.A02
            r1.setVisibility(r11)
            r0 = 2131971391(0x7f134d3f, float:1.957976E38)
            r1.setText(r0)
            goto L_0x0099
        L_0x00b0:
            java.lang.Boolean r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x00ce
            java.lang.Integer r0 = r8.A00
            if (r0 == 0) goto L_0x00d6
            java.lang.String r1 = X.C59807JZb.A00(r0)
        L_0x00c0:
            java.lang.String r0 = "unavailable_reason"
            r6.A06(r0, r1)
            X.818 r2 = X.AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS
            X.JZY r1 = X.JZY.UNAVAILABLE
            X.JZZ r0 = X.JZZ.STORY
            X.JZX.A00(r1, r0, r2, r6, r7)
        L_0x00ce:
            android.widget.TextView r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0099
        L_0x00d6:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x00c0
        L_0x00d9:
            android.view.View r1 = r5.A01
            X.KIP r0 = new X.KIP
            r0.<init>(r10, r8, r11)
            goto L_0x0049
        L_0x00e2:
            android.view.View r1 = r5.A01
            X.KIR r0 = new X.KIR
            r0.<init>(r10, r6)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61477K9i.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C61477K9i(AnonymousClass0iw r1, UserSession userSession, C65634LxB lxB, C363008it r4) {
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = lxB;
        this.A00 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 454402940);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_story, false);
        0qQ.A07(context);
        A0A.setTag(new L90(A0A));
        AnonymousClass0fD.A0A(1845121093, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
