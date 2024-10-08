package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.UpG  reason: case insensitive filesystem */
public final class C16129UpG extends AnonymousClass71O implements C231292rN, AnonymousClass71P {
    public final Context A00;
    public final 2ZX A01;
    public final AnonymousClass2s2 A02;
    public final AnonymousClass2s2 A03;
    public final UserSession A04;
    public final C15562Ueq A05;
    public final VW9 A06;
    public final AnonymousClass71Z A07;
    public final WZN A08;
    public final C48247EbS A09;
    public final C294255m9 A0A;
    public final ProfileMediaTabFragment A0B;
    public final C322616w8 A0C;
    public final AnonymousClass71T A0D;
    public final C229122ms A0E;
    public final C231762sK A0F;
    public final HashMap A0G = new HashMap();
    public final AnonymousClass0iw A0H;
    public final C267644bx A0I;
    public final AnonymousClass32J A0J;
    public final AnonymousClass726 A0K;
    public final AnonymousClass71V A0L;
    public final AnonymousClass71U A0M;
    public final AnonymousClass728 A0N;
    public final C232542tt A0O;
    public final AnonymousClass57M A0P;
    public final C15234UWt A0Q;
    public final C20962X6p A0R;
    public final AnonymousClass32Q A0S;
    public final C267614bu A0T;
    public final HashMap A0U = new HashMap();
    public final HashMap A0V = new HashMap();
    public final AtomicBoolean A0W;

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        HashMap hashMap = this.A0U;
        AnonymousClass6u8 r0 = (AnonymousClass6u8) hashMap.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6u8 r02 = new AnonymousClass6u8();
        hashMap.put(str, r02);
        return r02;
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        HashMap hashMap = this.A0V;
        AnonymousClass3W1 r0 = (AnonymousClass3W1) hashMap.get(r3);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3W1 A18 = G9t.A18(r3);
        hashMap.put(r3, A18);
        return A18;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0.length() == 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.length() == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r12 = this;
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r10 = r12.A04
            com.instagram.user.model.User r1 = r0.A01(r10)
            java.lang.String r0 = r1.getFullName()
            r11 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r1.getFullName()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            r9 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            java.lang.String r0 = r1.A0O()
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r1.A0O()
            if (r0 == 0) goto L_0x0030
            int r0 = r0.length()
            r8 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r8 = 0
        L_0x0031:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36599611058490976(0x820727000f0e60, double:3.209079635969745E-306)
            long r5 = X.182.A01(r7, r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1 = 2
            if (r0 == 0) goto L_0x0048
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0058
        L_0x0048:
            long r3 = X.182.A01(r7, r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 1
            if (r0 == 0) goto L_0x005f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
        L_0x0058:
            if (r9 == 0) goto L_0x005c
            if (r8 != 0) goto L_0x0061
        L_0x005c:
            if (r11 == 0) goto L_0x0061
            return
        L_0x005f:
            r11 = 0
            goto L_0x0058
        L_0x0061:
            X.71Z r2 = r12.A07
            X.2ZX r0 = r12.A01
            X.Mfn r1 = r2.A00(r0)
            X.71a r0 = r2.A03
            r12.addModel(r1, r0)
            r1 = 0
            X.2s2 r0 = r2.A01
            r12.addModel(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16129UpG.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b1, code lost:
        if (r1.A02 == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r1.A02 == false) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02d1 A[Catch:{ all -> 0x0335 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02dd A[Catch:{ all -> 0x01ee, all -> 0x0343 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011e A[Catch:{ all -> 0x01ee, all -> 0x0343 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e5 A[Catch:{ all -> 0x01ee, all -> 0x0343 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0050=Splitter:B:13:0x0050, B:82:0x0208=Splitter:B:82:0x0208, B:70:0x01df=Splitter:B:70:0x01df} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r20 = this;
            r18 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)
            if (r0 == 0) goto L_0x0010
            r1 = 1465497305(0x5759b6d9, float:2.39379348E14)
            java.lang.String r0 = "ProfileGridItemTabAdapter.updateItems"
            X.0fS.A01(r0, r1)
        L_0x0010:
            r5 = r20
            X.UWt r0 = r5.A0Q     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0019
            r0.A0T()     // Catch:{ all -> 0x0343 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A0W     // Catch:{ all -> 0x0343 }
            r0 = 1
            r4.set(r0)     // Catch:{ all -> 0x0343 }
            r5.clear()     // Catch:{ all -> 0x0343 }
            X.6wI r8 = r5.A00     // Catch:{ all -> 0x0343 }
            X.WZN r8 = (X.WZN) r8     // Catch:{ all -> 0x0343 }
            X.5m9 r1 = r5.A0A     // Catch:{ all -> 0x0343 }
            X.5mA r6 = r1.A00     // Catch:{ all -> 0x0343 }
            r3 = 0
            X.0qQ.A0B(r6, r3)     // Catch:{ all -> 0x0343 }
            X.WZN.A00(r8, r6)     // Catch:{ all -> 0x0343 }
            X.WZM r0 = X.WZN.A00(r8, r6)     // Catch:{ all -> 0x0343 }
            X.UlV r2 = r0.A07     // Catch:{ all -> 0x0343 }
            X.6vQ r0 = r0.A06     // Catch:{ all -> 0x0343 }
            r2.A08(r0)     // Catch:{ all -> 0x0343 }
            int r0 = r2.A02()     // Catch:{ all -> 0x0343 }
            if (r0 != 0) goto L_0x01fa
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0050
            r2 = -1239404721(0xffffffffb6202f4f, float:-2.3869395E-6)
            java.lang.String r0 = "ProfileGridItemTabAdapter.updateItemsWithEmptyState"
            X.0fS.A01(r0, r2)     // Catch:{ all -> 0x0343 }
        L_0x0050:
            X.VW9 r7 = r5.A06     // Catch:{ all -> 0x01ee }
            X.2ms r2 = r7.A02     // Catch:{ all -> 0x01ee }
            boolean r0 = r2.isLoading()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x006a
            X.6rr r11 = X.C320156rr.LOADING     // Catch:{ all -> 0x01ee }
        L_0x005c:
            r10 = 1
            r12 = 3
            X.72b r9 = new X.72b     // Catch:{ all -> 0x01ee }
            r9.<init>()     // Catch:{ all -> 0x01ee }
            int r2 = r11.ordinal()     // Catch:{ all -> 0x01ee }
            if (r2 == r12) goto L_0x009b
            goto L_0x0093
        L_0x006a:
            boolean r0 = r2.CT5()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0083
            com.instagram.common.session.UserSession r2 = r7.A00     // Catch:{ all -> 0x01ee }
            X.WZN r0 = r7.A01     // Catch:{ all -> 0x01ee }
            com.instagram.profile.fragment.UserDetailTabController r0 = r0.A02     // Catch:{ all -> 0x01ee }
            X.6vu r0 = r0.A0P     // Catch:{ all -> 0x01ee }
            com.instagram.user.model.User r0 = r0.A0J     // Catch:{ all -> 0x01ee }
            boolean r0 = X.C324376zB.A01(r2, r0)     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x0083
            X.6rr r11 = X.C320156rr.ERROR     // Catch:{ all -> 0x01ee }
            goto L_0x005c
        L_0x0083:
            X.WZN r0 = r7.A01     // Catch:{ all -> 0x01ee }
            X.WZM r0 = X.WZN.A00(r0, r6)     // Catch:{ all -> 0x01ee }
            boolean r0 = r0.A00     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x0090
            X.6rr r11 = X.C320156rr.NOT_LOADED     // Catch:{ all -> 0x01ee }
            goto L_0x005c
        L_0x0090:
            X.6rr r11 = X.C320156rr.EMPTY     // Catch:{ all -> 0x01ee }
            goto L_0x005c
        L_0x0093:
            if (r2 == r3) goto L_0x00a8
            r0 = 2
            if (r2 != r0) goto L_0x01df
            r9.A0M = r10     // Catch:{ all -> 0x01ee }
            goto L_0x00d7
        L_0x009b:
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
            r9.A02 = r0     // Catch:{ all -> 0x01ee }
            X.WBD r0 = new X.WBD     // Catch:{ all -> 0x01ee }
            r0.<init>((int) r10, (java.lang.Object) r8, (java.lang.Object) r1)     // Catch:{ all -> 0x01ee }
            r9.A05 = r0     // Catch:{ all -> 0x01ee }
            goto L_0x00d7
        L_0x00a8:
            com.instagram.profile.fragment.UserDetailTabController r0 = r8.A02     // Catch:{ all -> 0x01ee }
            X.6vu r0 = r0.A0P     // Catch:{ all -> 0x01ee }
            com.instagram.common.session.UserSession r1 = r0.A0c     // Catch:{ all -> 0x01ee }
            com.instagram.user.model.User r0 = r0.A0J     // Catch:{ all -> 0x01ee }
            boolean r0 = X.C324376zB.A01(r1, r0)     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x013b
            android.content.res.Resources r1 = r8.A00     // Catch:{ all -> 0x01ee }
            X.0qQ.A0B(r1, r3)     // Catch:{ all -> 0x01ee }
            X.72b r9 = new X.72b     // Catch:{ all -> 0x01ee }
            r9.<init>()     // Catch:{ all -> 0x01ee }
            r0 = 2131231745(0x7f080401, float:1.807958E38)
            r9.A02 = r0     // Catch:{ all -> 0x01ee }
            r0 = 2131975275(0x7f135c6b, float:1.9587638E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0D = r0     // Catch:{ all -> 0x01ee }
            r0 = 2131962588(0x7f132adc, float:1.9561905E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A07 = r0     // Catch:{ all -> 0x01ee }
        L_0x00d7:
            X.6rr r2 = X.C320156rr.EMPTY     // Catch:{ all -> 0x01ee }
            if (r11 != r2) goto L_0x0125
            X.0eE r1 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x01ee }
            com.instagram.common.session.UserSession r0 = r5.A04     // Catch:{ all -> 0x01ee }
            com.instagram.user.model.User r0 = r1.A01(r0)     // Catch:{ all -> 0x01ee }
            boolean r0 = r0.A2L()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x00f3
            X.EbS r1 = r5.A09     // Catch:{ all -> 0x01ee }
            boolean r0 = r1.A03     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0125
            boolean r0 = r1.A02     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x0125
        L_0x00f3:
            X.71Z r1 = r5.A07     // Catch:{ all -> 0x01ee }
            X.2ZX r0 = r5.A01     // Catch:{ all -> 0x01ee }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0125
            r1.A01(r9)     // Catch:{ all -> 0x01ee }
            X.71T r0 = r5.A0D     // Catch:{ all -> 0x01ee }
            r5.addModel(r9, r11, r0)     // Catch:{ all -> 0x01ee }
            r5.A00()     // Catch:{ all -> 0x01ee }
        L_0x0108:
            com.instagram.profile.fragment.ProfileMediaTabFragment r0 = r5.A0B     // Catch:{ all -> 0x01ee }
            r0.A01()     // Catch:{ all -> 0x01ee }
        L_0x010d:
            com.instagram.profile.fragment.ProfileMediaTabFragment r7 = r5.A0B     // Catch:{ all -> 0x01ee }
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x01ee }
            r0 = 2130968707(0x7f040083, float:1.7546075E38)
            int r2 = X.2Yu.A0H(r1, r0)     // Catch:{ all -> 0x01ee }
            android.content.Context r1 = r7.getContext()     // Catch:{ all -> 0x01ee }
            if (r1 == 0) goto L_0x01df
            androidx.recyclerview.widget.RecyclerView r0 = r7.mRecyclerView     // Catch:{ all -> 0x01ee }
            X.DbT.A16(r1, r0, r2)     // Catch:{ all -> 0x01ee }
            goto L_0x01df
        L_0x0125:
            r9.A0L = r10     // Catch:{ all -> 0x01ee }
            r9.A0P = r3     // Catch:{ all -> 0x01ee }
            r9.A0G = r10     // Catch:{ all -> 0x01ee }
            r9.A0F = r10     // Catch:{ all -> 0x01ee }
            X.6w8 r0 = r5.A0C     // Catch:{ all -> 0x01ee }
            int r0 = r0.A01     // Catch:{ all -> 0x01ee }
            r9.A04 = r0     // Catch:{ all -> 0x01ee }
            X.71T r0 = r5.A0D     // Catch:{ all -> 0x01ee }
            r5.addModel(r9, r11, r0)     // Catch:{ all -> 0x01ee }
            if (r11 != r2) goto L_0x010d
            goto L_0x0108
        L_0x013b:
            X.WZM r8 = X.WZN.A00(r8, r6)     // Catch:{ all -> 0x01ee }
            X.72b r9 = new X.72b     // Catch:{ all -> 0x01ee }
            r9.<init>()     // Catch:{ all -> 0x01ee }
            boolean r0 = r8.A09     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01cd
            r0 = 2131231747(0x7f080403, float:1.8079584E38)
            r9.A02 = r0     // Catch:{ all -> 0x01ee }
            com.instagram.common.session.UserSession r7 = r8.A02     // Catch:{ all -> 0x01ee }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x01ee }
            r0 = 36599611057573470(0x82072700010e5e, double:3.209079635389511E-306)
            long r0 = X.182.A01(r2, r7, r0)     // Catch:{ all -> 0x01ee }
            int r13 = (int) r0     // Catch:{ all -> 0x01ee }
            if (r13 == r10) goto L_0x01a5
            r0 = 2
            if (r13 == r0) goto L_0x0181
            if (r13 == r12) goto L_0x01ab
            android.content.Context r1 = r8.A01     // Catch:{ all -> 0x01ee }
            r0 = 2131973060(0x7f1353c4, float:1.9583145E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0D = r0     // Catch:{ all -> 0x01ee }
            r0 = 2131973057(0x7f1353c1, float:1.958314E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A07 = r0     // Catch:{ all -> 0x01ee }
            r0 = 2131973058(0x7f1353c2, float:1.9583141E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0C = r0     // Catch:{ all -> 0x01ee }
            r1 = 0
            goto L_0x01c4
        L_0x0181:
            android.content.Context r1 = r8.A01     // Catch:{ all -> 0x01ee }
            r0 = 2131973062(0x7f1353c6, float:1.958315E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0D = r0     // Catch:{ all -> 0x01ee }
            r0 = 2131973059(0x7f1353c3, float:1.9583143E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0C = r0     // Catch:{ all -> 0x01ee }
            r9.A0K = r10     // Catch:{ all -> 0x01ee }
            r9.A0I = r10     // Catch:{ all -> 0x01ee }
            r0 = 36318136081717134(0x810727000e178e, double:3.03107372724921E-306)
            boolean r0 = X.182.A06(r2, r7, r0)     // Catch:{ all -> 0x01ee }
            r9.A0J = r0     // Catch:{ all -> 0x01ee }
            goto L_0x01c3
        L_0x01a5:
            android.content.Context r1 = r8.A01     // Catch:{ all -> 0x01ee }
            r0 = 2131973061(0x7f1353c5, float:1.9583147E38)
            goto L_0x01b0
        L_0x01ab:
            android.content.Context r1 = r8.A01     // Catch:{ all -> 0x01ee }
            r0 = 2131973063(0x7f1353c7, float:1.9583151E38)
        L_0x01b0:
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0D = r0     // Catch:{ all -> 0x01ee }
            r0 = 2131973059(0x7f1353c3, float:1.9583143E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0C = r0     // Catch:{ all -> 0x01ee }
            r9.A0K = r10     // Catch:{ all -> 0x01ee }
            r9.A0I = r10     // Catch:{ all -> 0x01ee }
        L_0x01c3:
            r1 = 1
        L_0x01c4:
            X.Fma r0 = new X.Fma     // Catch:{ all -> 0x01ee }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x01ee }
            r9.A06 = r0     // Catch:{ all -> 0x01ee }
            goto L_0x00d7
        L_0x01cd:
            r0 = 2131231739(0x7f0803fb, float:1.8079568E38)
            r9.A02 = r0     // Catch:{ all -> 0x01ee }
            android.content.Context r1 = r8.A01     // Catch:{ all -> 0x01ee }
            r0 = 2131968412(0x7f13419c, float:1.9573718E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01ee }
            r9.A0D = r0     // Catch:{ all -> 0x01ee }
            goto L_0x00d7
        L_0x01df:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x01eb
            r0 = -843521991(0xffffffffcdb8e039, float:-3.877128E8)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0343 }
        L_0x01eb:
            r2 = 0
            goto L_0x02e9
        L_0x01ee:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0342
            r0 = -721890138(0xffffffffd4f8d4a6, float:-8.5497563E12)
            goto L_0x033f
        L_0x01fa:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0208
            r7 = -1754954091(0xffffffff97658695, float:-7.4163757E-25)
            java.lang.String r0 = "ProfileGridItemTabAdapter.updateItemsWithProfileFeedObjects"
            X.0fS.A01(r0, r7)     // Catch:{ all -> 0x0343 }
        L_0x0208:
            X.2s2 r0 = r5.A03     // Catch:{ all -> 0x0335 }
            r7 = 0
            r5.addModel(r7, r7, r0)     // Catch:{ all -> 0x0335 }
            int r12 = r2.A02()     // Catch:{ all -> 0x0335 }
            r11 = 0
        L_0x0213:
            if (r11 >= r12) goto L_0x0294
            X.71g r10 = X.C13989Tnp.A0e(r2, r11)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = X.AnonymousClass7TF.A0h(r10)     // Catch:{ all -> 0x0335 }
            X.6u8 r9 = r5.BQA(r0)     // Catch:{ all -> 0x0335 }
            X.2ms r0 = r5.A0E     // Catch:{ all -> 0x0335 }
            boolean r0 = r0.CKB()     // Catch:{ all -> 0x0335 }
            r13 = 1
            if (r0 != 0) goto L_0x028a
            int r0 = r2.A02()     // Catch:{ all -> 0x0335 }
            int r0 = r0 - r13
            if (r11 != r0) goto L_0x028a
        L_0x0231:
            r9.A00(r11, r13)     // Catch:{ all -> 0x0335 }
            X.5m9 r0 = X.C294255m9.A0B     // Catch:{ all -> 0x0335 }
            if (r1 != r0) goto L_0x028c
            java.util.Iterator r17 = r10.iterator()     // Catch:{ all -> 0x0335 }
        L_0x023c:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x028c
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x0335 }
            X.Vhb r0 = (X.C17884Vhb) r0     // Catch:{ all -> 0x0335 }
            X.1Xj r15 = r0.A02     // Catch:{ all -> 0x0335 }
            if (r15 == 0) goto L_0x023c
            boolean r0 = r15.A5D()     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x023c
            java.lang.String r13 = r15.getId()     // Catch:{ all -> 0x0335 }
            if (r13 == 0) goto L_0x023c
            com.instagram.profile.fragment.UserDetailTabController r0 = r8.A02     // Catch:{ all -> 0x0335 }
            X.6vu r0 = r0.A0P     // Catch:{ all -> 0x0335 }
            com.instagram.user.model.User r0 = r0.A0J     // Catch:{ all -> 0x0335 }
            java.util.HashMap r14 = r5.A0G     // Catch:{ all -> 0x0335 }
            boolean r16 = r14.containsKey(r13)     // Catch:{ all -> 0x0335 }
            if (r16 != 0) goto L_0x0276
            if (r0 == 0) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            r0 = 0
            goto L_0x026f
        L_0x026b:
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0335 }
        L_0x026f:
            int r0 = X.C55090Hbz.A00(r15, r0)     // Catch:{ all -> 0x0335 }
            X.C66581MXm.A1S(r13, r14, r0)     // Catch:{ all -> 0x0335 }
        L_0x0276:
            java.lang.String r0 = r15.getId()     // Catch:{ all -> 0x0335 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x0335 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x023c
            int r0 = r0.intValue()     // Catch:{ all -> 0x0335 }
            r9.A01(r13, r0)     // Catch:{ all -> 0x0335 }
            goto L_0x023c
        L_0x028a:
            r13 = 0
            goto L_0x0231
        L_0x028c:
            X.Ueq r0 = r5.A05     // Catch:{ all -> 0x0335 }
            r5.addModel(r10, r9, r0)     // Catch:{ all -> 0x0335 }
            int r11 = r11 + 1
            goto L_0x0213
        L_0x0294:
            X.2ms r9 = r5.A0E     // Catch:{ all -> 0x0335 }
            X.2sK r0 = r5.A0F     // Catch:{ all -> 0x0335 }
            r5.addModel(r9, r7, r0)     // Catch:{ all -> 0x0335 }
            X.0eE r1 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0335 }
            com.instagram.common.session.UserSession r0 = r5.A04     // Catch:{ all -> 0x0335 }
            com.instagram.user.model.User r0 = r1.A01(r0)     // Catch:{ all -> 0x0335 }
            boolean r0 = r0.A2L()     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x02b3
            X.EbS r1 = r5.A09     // Catch:{ all -> 0x0335 }
            boolean r0 = r1.A03     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x02cb
            boolean r0 = r1.A02     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x02cb
        L_0x02b3:
            X.71Z r1 = r5.A07     // Catch:{ all -> 0x0335 }
            X.2ZX r0 = r5.A01     // Catch:{ all -> 0x0335 }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x02cb
            r5.A00()     // Catch:{ all -> 0x0335 }
        L_0x02c0:
            com.instagram.profile.fragment.ProfileMediaTabFragment r0 = r5.A0B     // Catch:{ all -> 0x0335 }
            androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView     // Catch:{ all -> 0x0335 }
            r0.setBackground(r7)     // Catch:{ all -> 0x0335 }
            X.WZN.A00(r8, r6)     // Catch:{ all -> 0x0335 }
            goto L_0x02d7
        L_0x02cb:
            boolean r0 = r9.CKB()     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x02c0
            X.2s2 r0 = r5.A02     // Catch:{ all -> 0x0335 }
            r5.addModel(r7, r7, r0)     // Catch:{ all -> 0x0335 }
            goto L_0x02c0
        L_0x02d7:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x02e3
            r0 = 360333847(0x157a4217, float:5.0539234E-26)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0343 }
        L_0x02e3:
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x0343 }
            int r2 = r0.size()     // Catch:{ all -> 0x0343 }
        L_0x02e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0343 }
            r1.<init>()     // Catch:{ all -> 0x0343 }
            r1.append(r6)     // Catch:{ all -> 0x0343 }
            java.lang.String r0 = "_notify_"
            r1.append(r0)     // Catch:{ all -> 0x0343 }
            r1.append(r2)     // Catch:{ all -> 0x0343 }
            java.lang.String r0 = "_items"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x0343 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x030b
            r0 = -614895528(0xffffffffdb597058, float:-6.1203593E16)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0343 }
        L_0x030b:
            r5.notifyDataSetChangedSmart()     // Catch:{ all -> 0x032a }
            r4.set(r3)     // Catch:{ all -> 0x032a }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x031d
            r0 = 2035391202(0x79519ae2, float:6.8020715E34)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0343 }
        L_0x031d:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)
            if (r0 == 0) goto L_0x0329
            r0 = 2015074239(0x781b97bf, float:1.2623184E34)
            X.0fS.A00(r0)
        L_0x0329:
            return
        L_0x032a:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0342
            r0 = 624600755(0x253aa6b3, float:1.6189408E-16)
            goto L_0x033f
        L_0x0335:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0342
            r0 = 83594711(0x4fb8dd7, float:5.9140076E-36)
        L_0x033f:
            X.0fS.A00(r0)     // Catch:{ all -> 0x0343 }
        L_0x0342:
            throw r1     // Catch:{ all -> 0x0343 }
        L_0x0343:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r18)
            if (r0 == 0) goto L_0x0350
            r0 = -1455535834(0xffffffffa93e4926, float:-4.225192E-14)
            X.0fS.A00(r0)
        L_0x0350:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16129UpG.A01():void");
    }

    public final long getItemId(int i) {
        int hashCode;
        int A032 = AnonymousClass0fD.A03(-146655494);
        Object item = getItem(i);
        C231642s0 binderGroup = getBinderGroup(i);
        if (binderGroup == this.A05) {
            0qQ.A0C(item, C273654mx.A00(852));
            hashCode = AnonymousClass7TF.A0h(item).hashCode();
        } else {
            hashCode = Arrays.hashCode(C51968G9o.A1Z(binderGroup, getBinderGroupViewType(i)));
        }
        long j = (long) hashCode;
        AnonymousClass0fD.A0A(-1251239645, A032);
        return j;
    }

    public final void Cs9(1Xj r1) {
        A01();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.71V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.2s2} */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r23v2, types: [X.2s0] */
    /* JADX WARNING: type inference failed for: r18v1, types: [X.2s0] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x012d, code lost:
        if (X.C321616uT.A00(r10) == false) goto L_0x012f;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16129UpG(android.content.Context r33, X.2ZX r34, X.AnonymousClass0iw r35, com.instagram.common.session.UserSession r36, X.C267644bx r37, X.AnonymousClass32J r38, X.AnonymousClass726 r39, X.AnonymousClass728 r40, X.AnonymousClass57M r41, X.WZN r42, X.C48247EbS r43, X.C294255m9 r44, com.instagram.profile.fragment.ProfileMediaTabFragment r45, X.C15234UWt r46, X.C322616w8 r47, X.C20962X6p r48, X.AnonymousClass32Q r49, X.C229122ms r50, X.C267614bu r51, java.lang.String r52, boolean r53) {
        /*
            r32 = this;
            r18 = 1
            r0 = 5
            r10 = r36
            X.0qQ.A0B(r10, r0)
            r0 = 6
            r6 = r42
            r2 = r50
            r3 = r49
            X.C51973G9u.A0t(r0, r3, r2, r6)
            r0 = 10
            r5 = r44
            r1 = r47
            X.DbW.A1P(r5, r0, r1)
            r0 = 13
            r9 = r39
            X.0qQ.A0B(r9, r0)
            r0 = 14
            r8 = r40
            X.0qQ.A0B(r8, r0)
            X.WZO r7 = new X.WZO
            r7.<init>(r5)
            X.2lZ r4 = new X.2lZ
            r31 = r35
            r11 = r33
            r0 = r31
            r4.<init>(r11, r0, r10, r7)
            r28 = 0
            r12 = r32
            r12.<init>(r4, r6)
            r12.A00 = r11
            r13 = r38
            r12.A0J = r13
            r15 = r37
            r12.A0I = r15
            r4 = r48
            r12.A0R = r4
            r12.A04 = r10
            r12.A0S = r3
            r12.A0H = r0
            r12.A0E = r2
            r12.A08 = r6
            r12.A0A = r5
            r30 = r51
            r0 = r30
            r12.A0T = r0
            r12.A0C = r1
            r12.A0K = r9
            r12.A0N = r8
            r0 = r43
            r12.A09 = r0
            r7 = r41
            r12.A0P = r7
            r0 = r46
            r12.A0Q = r0
            r0 = r45
            r12.A0B = r0
            r0 = r34
            r12.A01 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0U = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0V = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0G = r0
            X.0Tu r14 = X.0Tu.A05
            r0 = 36327237116508400(0x810f6e000038f0, double:3.036829258298132E-306)
            boolean r29 = X.182.A06(r14, r10, r0)
            com.instagram.profile.fragment.UserDetailTabController r0 = r6.A02
            X.6vu r0 = r0.A0P
            com.instagram.user.model.User r0 = r0.A0J
            java.lang.String r26 = X.C13989Tnp.A0r(r0)
            X.Ueq r0 = new X.Ueq
            r27 = r52
            r19 = r0
            r20 = r31
            r21 = r10
            r22 = r15
            r23 = r13
            r24 = r4
            r25 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r12.A05 = r0
            X.71T r14 = new X.71T
            r14.<init>(r11)
            r12.A0D = r14
            X.71U r13 = new X.71U
            r13.<init>(r11)
            r12.A0M = r13
            X.71V r17 = new X.71V
            r17.<init>()
            r1 = r17
            r12.A0L = r1
            X.2sK r4 = new X.2sK
            r4.<init>((android.content.Context) r11, (X.AnonymousClass57M) r7)
            r12.A0F = r4
            X.2s2 r7 = new X.2s2
            r7.<init>()
            r12.A03 = r7
            X.2s2 r16 = new X.2s2
            r16.<init>()
            r1 = r16
            r12.A02 = r1
            X.2tt r3 = new X.2tt
            r3.<init>(r11, r10)
            r12.A0O = r3
            android.content.Context r1 = r12.A00
            r20 = r1
            com.instagram.common.session.UserSession r1 = r12.A04
            r19 = r1
            X.WZP r1 = new X.WZP
            r1.<init>(r12)
            X.71Z r15 = new X.71Z
            r21 = r31
            r22 = r19
            r23 = r1
            r24 = r30
            r19 = r15
            r19.<init>(r20, r21, r22, r23, r24)
            r12.A07 = r15
            X.VW9 r1 = new X.VW9
            r1.<init>(r10, r6, r2)
            r12.A06 = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r12.A0W = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.A00 = r1
            r1 = r53
            r0.A04 = r1
            X.5m9 r1 = X.C294255m9.A0C
            if (r5 != r1) goto L_0x012f
            boolean r2 = X.C321616uT.A00(r10)
            r1 = 1
            if (r2 != 0) goto L_0x0130
        L_0x012f:
            r1 = 0
        L_0x0130:
            r0.A03 = r1
            r0.A01 = r9
            r0.A02 = r8
            int r1 = X.C13989Tnp.A0B(r11)
            r7.A03 = r1
            int r1 = X.2Yu.A0C(r11)
            r7.A00 = r1
            r1 = r18
            r12.setHasStableIds(r1)
            X.71a r2 = r15.A03
            X.2s2 r1 = r15.A01
            r19 = r0
            r20 = r14
            r21 = r4
            r22 = r13
            r23 = r17
            r24 = r2
            r25 = r1
            r26 = r3
            r17 = r7
            r18 = r16
            X.2s0[] r0 = new X.C231642s0[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26}
            r12.init(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16129UpG.<init>(android.content.Context, X.2ZX, X.0iw, com.instagram.common.session.UserSession, X.4bx, X.32J, X.726, X.728, X.57M, X.WZN, X.EbS, X.5m9, com.instagram.profile.fragment.ProfileMediaTabFragment, X.UWt, X.6w8, X.X6p, X.32Q, X.2ms, X.4bu, java.lang.String, boolean):void");
    }
}
