package X;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import com.instagram.compose.core.ui.IgClickableTextKt$IgClickableText$pressIndicator$1$1$1;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.9KR  reason: invalid class name */
public final class AnonymousClass9KR extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KR(C284945Oz r2, C286025Tq r3, AnonymousClass4D7 r4, 0sP r5, 0sP r6, boolean z) {
        super(2, r4);
        this.A07 = z;
        this.A05 = r2;
        this.A01 = r5;
        this.A04 = r3;
        this.A06 = r6;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9KR, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        FriendMapRepository friendMapRepository;
        Object obj2 = obj;
        if (this.A03 != 0) {
            1Hj r2 = 1Hj.A02;
            if (this.A00 != 0) {
                friendMapRepository = (FriendMapRepository) this.A01;
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                friendMapRepository = (FriendMapRepository) this.A02;
                AnonymousClass4A4 r0 = friendMapRepository.A09;
                this.A01 = friendMapRepository;
                this.A00 = 1;
                obj2 = r0.A00.A08(this);
                if (obj2 == r2) {
                    return r2;
                }
            }
            FriendMapRepository.A04(friendMapRepository, (Bm7) obj2, (Double) this.A04, (Double) this.A05, (0sP) this.A06, this.A07);
        } else {
            1Hj r22 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                boolean z = this.A07;
                IgClickableTextKt$IgClickableText$pressIndicator$1$1$1 igClickableTextKt$IgClickableText$pressIndicator$1$1$1 = new IgClickableTextKt$IgClickableText$pressIndicator$1$1$1((C284945Oz) this.A05, (C286025Tq) this.A04, (AnonymousClass4D7) null, (0sP) this.A01, (0sP) this.A06, z);
                this.A00 = 1;
                if (ForEachGestureKt.A01((AnonymousClass6FR) this.A02, this, igClickableTextKt$IgClickableText$pressIndicator$1$1$1) == r22) {
                    return r22;
                }
            }
        }
        return C60340gF.A00;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9KR, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        AnonymousClass4D7 r4 = r10;
        if (this.A03 != 0) {
            return new AnonymousClass9KR((FriendMapRepository) this.A02, (Double) this.A04, (Double) this.A05, r4, (0sP) this.A06, this.A07);
        }
        boolean z = this.A07;
        AnonymousClass9KR r1 = new AnonymousClass9KR((C284945Oz) this.A05, (C286025Tq) this.A04, r4, (0sP) this.A01, (0sP) this.A06, z);
        r1.A02 = obj;
        return r1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KR) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KR(FriendMapRepository friendMapRepository, Double d, Double d2, AnonymousClass4D7 r5, 0sP r6, boolean z) {
        super(2, r5);
        this.A02 = friendMapRepository;
        this.A07 = z;
        this.A04 = d;
        this.A05 = d2;
        this.A06 = r6;
    }
}
