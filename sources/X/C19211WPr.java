package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.WPr  reason: case insensitive filesystem */
public final class C19211WPr implements C13669Ted {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xg A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ int[] A07;

    public C19211WPr(AnonymousClass0iw r1, UserSession userSession, 1Xg r3, List list, int[] iArr, int i, long j, boolean z) {
        this.A01 = j;
        this.A07 = iArr;
        this.A06 = z;
        this.A03 = userSession;
        this.A02 = r1;
        this.A05 = list;
        this.A00 = i;
        this.A04 = r3;
    }

    public final boolean FN7(C276544tV r8) {
        long j = this.A01;
        if (j == -1 || ((long) this.A07[0]) < j) {
            int i = r8.A04;
            String str = null;
            if (i == 13323) {
                str = r8.A0F();
            }
            if ((!this.A06 || str == null) && (!(i == 13323 || i == 13380) || (str = r8.A0I()) == null)) {
                str = "";
            }
            UserSession userSession = this.A03;
            if ((!182.A06(0Tu.A05, userSession, 36311272723579364L) || !str.isEmpty()) && !str.isEmpty()) {
                AnonymousClass6QE r1 = AnonymousClass6QE.A02;
                C242693Vo A062 = C242663Vj.A06(userSession, new SimpleImageUrl(AnonymousClass6QJ.A01(0cp.A03(str), false).toString()), this.A02.getModuleName());
                List list = this.A05;
                Integer valueOf = Integer.valueOf(this.A00);
                int[] iArr = this.A07;
                int i2 = iArr[0];
                iArr[0] = i2 + 1;
                list.add(new 1yX(A062, new C242703Vp(Pxf.A0K(valueOf, i2), this.A04.A05.CBd())));
                return false;
            }
        }
        return false;
    }
}
