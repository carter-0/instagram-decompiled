package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;

/* renamed from: X.AXt  reason: case insensitive filesystem */
public final class C40255AXt implements AnonymousClass1MK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C3498482b A02;
    public final /* synthetic */ C39890ADo A03;
    public final /* synthetic */ InteractiveDrawableContainer A04;
    public final /* synthetic */ String A05;

    /* JADX WARNING: type inference failed for: r0v9, types: [X.8DA, java.lang.Object] */
    public final void CyF(C226952iF r18, AnonymousClass3LX r19) {
        AnonymousClass3LX r0 = r19;
        0qQ.A0B(r0, 1);
        Bitmap bitmap = r0.A01;
        if (bitmap != null) {
            Context context = this.A00;
            UserSession userSession = this.A01;
            C3498482b r13 = this.A02;
            User user = r13.A09;
            if (user == null) {
                user = r13.A0A;
            }
            String str = r13.A0C;
            String A012 = AnonymousClass91L.A01(context, r13);
            Drawable A002 = AnonymousClass91L.A00(context, userSession, r13, this.A05);
            AnonymousClass7TF.A1D(user, 3, str);
            AnonymousClass8DV r10 = new AnonymousClass8DV(context.getResources(), bitmap);
            r10.A02(((float) r13.A01) * 0.04f);
            C386059jz r8 = new C386059jz(context, r10, A002, userSession, r13, user, str, A012);
            C39890ADo aDo = this.A03;
            boolean A1Y = AnonymousClass7TF.A1Y(r13.A05.A02(), true);
            C40669Agj agj = new C40669Agj(r8.A00, (C3510387i) null, r13);
            Integer num = AnonymousClass05K.A00;
            ? obj = new Object();
            obj.A00 = 0.0f;
            obj.A01 = 1.0f;
            obj.A04 = A1Y;
            obj.A02 = agj;
            obj.A03 = num;
            aDo.A07 = obj;
            this.A04.A0K(r8, new C310416b1(aDo), false, false, false);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C40255AXt(Context context, UserSession userSession, C3498482b r3, C39890ADo aDo, InteractiveDrawableContainer interactiveDrawableContainer, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A05 = str;
        this.A03 = aDo;
        this.A04 = interactiveDrawableContainer;
    }
}
