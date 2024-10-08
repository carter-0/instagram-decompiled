package X;

import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$initPrefetch$2$1;
import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$initPrefetch$lambda$12$$inlined$CoroutineExceptionHandler$1;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class W04 {
    public static W04 A0A;
    public VLB A00;
    public X7R A01;
    public CommonCdlProviderHolder A02;
    public VLP A03;
    public IgCdlProviderBuilder A04;
    public LDN A05;
    public C17843Vgw A06;
    public QuickPerformanceLogger A07;
    public C262224Cq A08;
    public final C18524VtO A09 = new Object();

    public static final void A00(WF8 wf8, C18073Vl1 vl1, AtomicBoolean atomicBoolean, 1IX r5) {
        if (atomicBoolean.compareAndSet(false, true) && r5.isActive()) {
            if (vl1 != null) {
                vl1.A01("INIT_PREFETCH");
            }
            r5.EJ1(C20714Wxn.A00, wf8);
        }
    }

    public static final void A01(W04 w04, C307896Rx r3, C277014uI r4, String str) {
        C64164LRf lRf;
        LDN ldn = w04.A05;
        if (!(ldn == null || (lRf = ldn.A00) == null)) {
            lRf.A03();
        }
        if (r4 != null) {
            Dbc.A0t(r3, r4, str, (Object) null);
        }
    }

    public final boolean A03(UL7 ul7) {
        C17843Vgw vgw = this.A06;
        String str = "networkProvider";
        if (vgw != null) {
            String A002 = C62974KpQ.A00(vgw.A00);
            Map map = ul7.A00;
            if (map != null && map.containsKey(A002)) {
                return true;
            }
            VLB vlb = this.A00;
            if (vlb == null) {
                str = "avatarEmbodimentSupport";
            } else {
                if (182.A06(0Tu.A05, vlb.A00, 36317672224789946L)) {
                    return false;
                }
                Integer num = AnonymousClass05K.A0Y;
                C17843Vgw vgw2 = this.A06;
                if (vgw2 != null) {
                    if (num != vgw2.A00) {
                        return true;
                    }
                    return false;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A02(C15046UKz uKz, C18073Vl1 vl1, AnonymousClass4D7 r12, C262224Cq r13, boolean z, boolean z2) {
        1IW A0q = C51973G9u.A0q(r12);
        C18073Vl1 vl12 = vl1;
        if (vl1 != null) {
            vl1.A02("INIT_PREFETCH");
        }
        1Eo.A05(new CommonBloksActionHelper$initPrefetch$lambda$12$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, A0q), new CommonBloksActionHelper$initPrefetch$2$1(uKz, this, vl12, (AnonymousClass4D7) null, A0q, z2, z), r13);
        return A0q.A0E();
    }
}
