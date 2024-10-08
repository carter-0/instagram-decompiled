package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.AbE  reason: case insensitive filesystem */
public final class C40381AbE implements MTZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4D6 A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ L83 A04;
    public final /* synthetic */ FilterGroupModel A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ C352218Cl A07;
    public final /* synthetic */ Runnable A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C40381AbE(Context context, UserSession userSession, AnonymousClass4D6 r3, 1GK r4, L83 l83, FilterGroupModel filterGroupModel, AnonymousClass3Q2 r7, C352218Cl r8, Runnable runnable, boolean z, boolean z2) {
        this.A01 = userSession;
        this.A06 = r7;
        this.A0A = z;
        this.A00 = context;
        this.A07 = r8;
        this.A05 = filterGroupModel;
        this.A04 = l83;
        this.A02 = r3;
        this.A09 = z2;
        this.A08 = runnable;
        this.A03 = r4;
    }

    public final void DVt() {
        C59797JYq.A07(this.A00, this.A01, this.A06, "template_overlay_failed_to_save");
    }

    public final void DVu(String str) {
        Bitmap decodeFile;
        ShareType shareType = ShareType.STORY_TEMPLATE_ASSET;
        UserSession userSession = this.A01;
        AnonymousClass3Q2 A032 = C59797JYq.A03(userSession, shareType);
        0Tu r12 = 0Tu.A05;
        String str2 = str;
        if (182.A06(r12, userSession, 36327709562911364L) && (decodeFile = BitmapFactory.decodeFile(str2, new BitmapFactory.Options())) != null) {
            int max = Math.max(1, decodeFile.getWidth() * decodeFile.getHeight());
            int i = 0;
            for (int i2 = 0; i2 < decodeFile.getWidth(); i2++) {
                for (int i3 = 0; i3 < decodeFile.getHeight(); i3++) {
                    if (((long) Color.alpha(decodeFile.getPixel(i2, i3))) > 182.A01(r12, userSession, 36609184539744070L)) {
                        i++;
                    }
                }
            }
            A032.A0I = AnonymousClass7TE.A05(((float) i) / ((float) max), 100.0f);
        }
        A032.A33 = str2;
        AnonymousClass3Q2 r7 = this.A06;
        r7.A0X(A032);
        if (this.A0A) {
            Context context = this.A00;
            C352218Cl r6 = this.A07;
            FilterGroupModel filterGroupModel = this.A05;
            L83 l83 = this.A04;
            AnonymousClass4D6 r3 = this.A02;
            boolean z = this.A09;
            Runnable runnable = this.A08;
            C59797JYq.A05(context, userSession, r3, this.A03, l83, filterGroupModel, r7, r6, runnable, z);
            return;
        }
        this.A08.run();
    }
}
