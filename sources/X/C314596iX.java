package X;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6iX  reason: invalid class name and case insensitive filesystem */
public final class C314596iX implements AnonymousClass6Z1 {
    public final C270414gh A00;
    public final String A01;
    public final WeakReference A02;
    public final Context A03;
    public final UserSession A04;

    public C314596iX(Context context, AnonymousClass4DJ r3, UserSession userSession, C270414gh r5, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 3);
        0qQ.A0B(str, 4);
        this.A04 = userSession;
        this.A03 = context;
        this.A00 = r5;
        this.A01 = str;
        this.A02 = new WeakReference(r3);
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [X.6Yc, java.lang.Object] */
    public final void D7Q(C255773uh r12, C250973mM r13, C316026kz r14, C309426Yf r15) {
        0qQ.A0B(r12, 1);
        C270414gh r1 = this.A00;
        C250973mM Bl0 = r1.Bl0(r12.A0k);
        if (Bl0 != null) {
            int CMI = r1.CMI(Bl0);
            AnonymousClass4DJ r8 = (AnonymousClass4DJ) this.A02.get();
            if (r8 != null) {
                ArrayList arrayList = new ArrayList(3);
                ImageUrl A002 = A00(CMI, 1);
                if (!(A002 == null && (A002 = A00(CMI + 1, 0)) == null)) {
                    arrayList.add(A002);
                }
                ImageUrl A003 = A00(CMI, 0);
                if (A003 != null) {
                    arrayList.add(A003);
                }
                ImageUrl A004 = A00(CMI, -1);
                if (!(A004 == null && (A004 = A00(CMI - 1, 0)) == null)) {
                    arrayList.add(A004);
                }
                1MJ r6 = AnonymousClass1MP.A00;
                if (r6 == null) {
                    0qQ.A0F("instance");
                    throw AnonymousClass00P.createAndThrow();
                }
                String str = this.A01;
                1MJ r62 = r6;
                11Z.A06("This operation must be run on UI thread.");
                if (AnonymousClass1K7.A00().A0E()) {
                    r62.A02.clear();
                    r62.A01 = 0;
                    r62.A00 = 0;
                    return;
                }
                1MJ.A00(r62, arrayList, r8.hashCode());
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    ImageUrl imageUrl = (ImageUrl) listIterator.previous();
                    Looper.myLooper();
                    Looper.getMainLooper();
                    imageUrl.AjH();
                    String str2 = ((ImageCacheKey) imageUrl.AjH()).A03;
                    0qQ.A07(str2);
                    int hashCode = r8.hashCode();
                    Set set = r62.A03;
                    Integer valueOf = Integer.valueOf(hashCode);
                    if (!set.contains(valueOf)) {
                        r8.registerLifecycleListener(new C309386Yb(r62, hashCode));
                        set.add(valueOf);
                    }
                    Map map = r62.A02;
                    C309396Yc r16 = (C309396Yc) map.remove(str2);
                    if (r16 == null || r16.A01 == null) {
                        1OO A0J = 1NK.A00().A0J(imageUrl, str);
                        A0J.A0O = true;
                        A0J.A02(r62);
                        C226952iF A005 = A0J.A00();
                        ? obj = new Object();
                        obj.A00 = hashCode;
                        map.put(str2, obj);
                        A005.E5t();
                    } else {
                        r16.A00 = hashCode;
                        map.put(str2, r16);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DWT(String str) {
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    private final ImageUrl A00(int i, int i2) {
        int i3;
        C250973mM Bky = this.A00.Bky(i);
        if (Bky == null) {
            return null;
        }
        UserSession userSession = this.A04;
        if (Bky.A0E(userSession) || (i3 = Bky.A01 + i2) < 0 || i3 >= Bky.A02(userSession)) {
            return null;
        }
        C255773uh A0A = Bky.A0A(userSession, i3);
        if (A0A.A0e != C250963mL.BRAND_SURVEY) {
            return A0A.A08(this.A03);
        }
        return null;
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }
}
