package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.3OX  reason: invalid class name */
public final class AnonymousClass3OX extends 0ng {
    public final /* synthetic */ AnonymousClass2iL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3OX(AnonymousClass2iL r4, boolean z) {
        super(512, 2, z, true);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass2iL r10 = this.A00;
        if (r10.A0Y == AnonymousClass05K.A00) {
            r10.A0Y = AnonymousClass05K.A01;
        }
        1NK r5 = r10.A0c;
        AnonymousClass1Nu r9 = r5.A0F;
        ImageUrl imageUrl = r10.A0L;
        int i = r10.A04;
        int i2 = 0;
        if (i > 0) {
            i2 = i + 1;
        }
        int i3 = r10.A0X;
        C227052iZ r13 = r10.A0A;
        List list = r10.A0a;
        String A0L = r5.A0L(imageUrl);
        C227002iM r12 = r10.A0J;
        int i4 = r5.A09;
        1QU A002 = r10.A0I.A00();
        boolean z = r5.A0V;
        0jG r7 = r5.A0E;
        boolean z2 = r10.A0Q;
        r10.A06 = new 2DM(r5.A0D, r7, A002, r9, r10, r5.A0K, r12, r13, r10.A0K, imageUrl, A0L, "queueTaskToLoadImageFromNetwork", list, i2, i3, i4, z, z2).A02();
    }
}
