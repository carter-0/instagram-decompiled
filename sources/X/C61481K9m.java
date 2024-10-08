package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* renamed from: X.K9m  reason: case insensitive filesystem */
public final class C61481K9m extends C231632rz {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final L1N A03;
    public final MVA A04;
    public final MTF A05;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00bd, code lost:
        if (r2 == r1) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r24, android.view.View r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r23 = this;
            r6 = r26
            r0 = 2031832819(0x791b4ef3, float:5.0400456E34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            if (r25 == 0) goto L_0x0127
            java.lang.Object r7 = r25.getTag()
        L_0x000f:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.story.ui.AddToExclusiveStoryViewBinder.Holder"
            X.0qQ.A0C(r7, r0)
            X.L9m r7 = (X.C63857L9m) r7
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.story.ui.SuggestedRecipientViewModel"
            X.0qQ.A0C(r6, r0)
            X.FV6 r6 = (X.FV6) r6
            r0 = r23
            X.L1N r2 = r0.A03
            com.instagram.common.session.UserSession r5 = r0.A01
            X.MTF r8 = r0.A05
            android.content.Context r14 = r0.A00
            X.MVA r9 = r0.A04
            r4 = 0
            com.instagram.pendingmedia.model.UserStoryTarget r1 = r6.A0A
            if (r1 == 0) goto L_0x012a
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r0.A02
            r15 = 0
            X.Lqt r13 = new X.Lqt
            r18 = r9
            r19 = r1
            r20 = r15
            r21 = r8
            r22 = r4
            r16 = r5
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0qQ.A0B(r7, r4)
            r9 = 1
            X.AnonymousClass7TG.A1Q(r2, r5)
            r10 = 4
            X.0qQ.A0B(r8, r10)
            android.widget.ImageView r1 = r7.A02
            boolean r0 = r6.A00
            r1.setActivated(r0)
            X.6jB r0 = X.C314986jA.A00(r5)
            X.0xa r1 = r0.A01
            r0 = 2345(0x929, float:3.286E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            int r12 = r1.getInt(r0, r4)
            X.3oV r11 = r7.A04
            r11.setVisibility(r4)
            android.view.View r5 = r11.getView()
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.view.View r6 = r7.A00
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131820908(0x7f11016c, float:1.9274544E38)
            java.lang.String r0 = X.DbY.A0d(r1, r12, r0)
            r5.setText(r0)
            android.view.View r1 = r11.getView()
            r0 = 25
            X.LYE.A00(r1, r0, r2)
            X.LRm r1 = r8.AXA()
            X.Juy r0 = X.C61002Juy.A03
            X.LMN r0 = r1.A01(r0)
            java.lang.Integer r11 = r0.A01
            X.LRm r1 = r8.AXA()
            X.Juy r0 = X.C61002Juy.A05
            X.LMN r0 = r1.A01(r0)
            java.lang.Integer r5 = r0.A01
            X.LRm r1 = r8.AXA()
            X.Juy r0 = X.C61002Juy.A0C
            X.LMN r0 = r1.A01(r0)
            java.lang.Integer r2 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r11 == r0) goto L_0x00bf
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r11 == r1) goto L_0x00bf
            if (r5 == r0) goto L_0x00bf
            if (r5 == r1) goto L_0x00bf
            if (r2 == r0) goto L_0x00bf
            r0 = 0
            if (r2 != r1) goto L_0x00c0
        L_0x00bf:
            r0 = 1
        L_0x00c0:
            android.view.View r5 = r7.A01
            X.5nL r2 = X.JTP.A0c(r5, r4)
            if (r0 == 0) goto L_0x00ee
            r0 = 0
            r2.A0I(r0)
            r2.A03 = r10
            r2.A0H()
            X.5nL r1 = X.JTP.A0c(r6, r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.A0I(r0)
            r1.A0H()
            X.LRd r0 = r7.A05
            android.view.View r0 = r0.A01
            r0.setClickable(r4)
        L_0x00e4:
            r5.setVisibility(r4)
            r0 = -387979203(0xffffffffe8dfe83d, float:-8.458974E24)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00ee:
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.A0I(r1)
            r2.A04 = r4
            r2.A0H()
            X.5nL r0 = X.JTP.A0c(r6, r4)
            r0.A0I(r1)
            r0.A0H()
            X.LRd r2 = r7.A05
            android.view.View r0 = r2.A01
            r0.setClickable(r9)
            X.LRm r1 = r8.AXA()
            X.Juy r0 = X.C61002Juy.A07
            X.LMN r0 = r1.A01(r0)
            r2.A03(r0, r13)
            android.content.res.Resources r1 = X.DbU.A05(r6)
            r0 = 2131960412(0x7f13225c, float:1.9557492E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A05(r1, r0)
            goto L_0x00e4
        L_0x0127:
            r7 = 0
            goto L_0x000f
        L_0x012a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1157814035(0x4502d713, float:2093.4421)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61481K9m.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C61481K9m(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, L1N l1n, MVA mva, MTF mtf) {
        C51974G9v.A1P(context, userSession, mtf, mva);
        0qQ.A0B(l1n, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = mtf;
        this.A04 = mva;
        this.A03 = l1n;
        this.A02 = ingestSessionShim;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Drawable drawable;
        int A032 = AnonymousClass0fD.A03(-129432893);
        0qQ.A0B(viewGroup, 1);
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 1);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_exclusive_story, false);
        C63857L9m l9m = new C63857L9m(A0A, userSession);
        TextView textView = l9m.A03;
        0qQ.A0A(context);
        textView.setTypeface(AnonymousClass7TG.A0N(context));
        ImageView imageView = l9m.A02;
        0qQ.A0B(context, 0);
        Drawable drawable2 = context.getDrawable(R.drawable.exclusive_story_recipient_picker);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A0A.setTag(l9m);
        AnonymousClass0fD.A0A(-941359394, A032);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
