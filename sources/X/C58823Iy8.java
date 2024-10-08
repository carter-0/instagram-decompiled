package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;

/* renamed from: X.Iy8  reason: case insensitive filesystem */
public final class C58823Iy8 extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ DirectShareTarget A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58823Iy8(UserSession userSession, ImageUrl imageUrl, DirectShareTarget directShareTarget, User user, String str, String str2, String str3, String str4, long j, boolean z) {
        super(1);
        this.A03 = directShareTarget;
        this.A01 = userSession;
        this.A07 = str;
        this.A00 = j;
        this.A08 = str2;
        this.A06 = str3;
        this.A04 = user;
        this.A05 = str4;
        this.A02 = imageUrl;
        this.A09 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C254783t2 r14 = (C254783t2) obj;
        DirectShareTarget directShareTarget = this.A03;
        DirectShareTarget directShareTarget2 = directShareTarget;
        if (r14 instanceof AnonymousClass9HR) {
            directShareTarget = new DirectShareTarget(r14, (PendingRecipient) AnonymousClass7TE.A13(Collections.unmodifiableList(directShareTarget.A0Q)));
        }
        AnonymousClass7Z7 A012 = OXC.A01(this.A01, directShareTarget);
        String str = this.A07;
        long j = this.A00;
        String str2 = this.A08;
        String str3 = this.A06;
        A012.ELZ(this.A02, directShareTarget2, (ExtendedImageUrl) null, this.A04, str, str2, str3, (String) null, this.A05, j, this.A09);
        return C60340gF.A00;
    }
}
