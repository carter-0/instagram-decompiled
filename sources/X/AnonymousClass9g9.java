package X;

import android.opengl.Matrix;
import android.util.Pair;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic.NativeConfigFactory;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9g9  reason: invalid class name */
public final class AnonymousClass9g9 extends C368948ta implements C345237tA, C368958tb {
    public String A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public boolean A01;
    public boolean A02 = false;
    public C344847sW A03;
    public final C366028o4 A04;
    public final IgluFilterNativeGraph A05;
    public final HashMap A06;
    public final float[] A07 = new float[16];
    public final C366078o9 A08;
    public final C365998o1 A09;

    public final void DpY(C345557ti r3) {
        this.A02 = false;
        C365998o1 r0 = this.A09;
        IgluConfigHolder createIgAssetConfig = NativeConfigFactory.createIgAssetConfig(r0.A00, r0.A01);
        0qQ.A07(createIgAssetConfig);
        this.A05.attach(createIgAssetConfig);
        C366028o4 r02 = this.A04;
        if (r02 != null) {
            r02.attach(createIgAssetConfig);
        }
        createIgAssetConfig.release();
        this.A01 = true;
    }

    public final void Dpb() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                this.A01 = false;
                Iterator A0t = AnonymousClass7TF.A0t(this.A06);
                while (A0t.hasNext()) {
                    FilterManagerImpl filterManagerImpl = (FilterManagerImpl) ((Pair) A0t.next()).first;
                    if (filterManagerImpl != null) {
                        filterManagerImpl.release();
                    }
                }
                C366028o4 r0 = this.A04;
                if (r0 != null) {
                    r0.detach();
                }
                this.A05.detach();
            }
        }
    }

    public final void EOi(C13586TdE tdE) {
    }

    public final void ESt(Integer num) {
    }

    @Deprecated
    public final boolean EtX() {
        return false;
    }

    public final boolean isEnabled() {
        return true;
    }

    public final void A00(C366548pF r5, String str) {
        Object filterManagerImpl;
        HashMap hashMap = this.A06;
        Pair pair = (Pair) hashMap.get(str);
        if (pair != null) {
            filterManagerImpl = pair.first;
        } else {
            filterManagerImpl = new FilterManagerImpl(this.A04, (C40136ATc) null);
        }
        hashMap.put(str, new Pair(filterManagerImpl, r5));
    }

    public final Integer BHb() {
        return AnonymousClass05K.A00;
    }

    public final boolean DAo(C368538so r11, long j) {
        Pair pair;
        if (!this.A01 || (pair = (Pair) this.A06.get(this.A00)) == null) {
            return false;
        }
        C366548pF r3 = (C366548pF) pair.second;
        FilterManagerImpl filterManagerImpl = (FilterManagerImpl) pair.first;
        if (r3 == null || filterManagerImpl == null) {
            return false;
        }
        this.A08.FK1(Long.valueOf(j * 1000));
        float[] fArr = this.A07;
        Matrix.multiplyMM(fArr, 0, r11.A04, 0, r11.A05, 0);
        Matrix.multiplyMM(fArr, 0, fArr, 0, r11.A03, 0);
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        C346337v0 A002 = r11.A00();
        r3.AC0(filterManagerImpl);
        r3.ACC(filterManagerImpl);
        r3.ACB(filterManagerImpl, fArr, r11.A02);
        IgluFilterNativeGraph igluFilterNativeGraph = this.A05;
        igluFilterNativeGraph.updateFilter(filterManagerImpl.getFilterWeakPtr());
        int i = A002.A00;
        int i2 = A002.A01;
        C346367v3 r0 = A002.A02;
        igluFilterNativeGraph.setInputTexture(i, i2, r0.A01, r0.A00);
        igluFilterNativeGraph.useCurrentOutputFramebuffer(14);
        igluFilterNativeGraph.render("IgluFilterRenderer");
        return true;
    }

    public final void EiW(C344847sW r3) {
        C344847sW r1 = this.A03;
        if (r3 != r1) {
            if (r1 != null) {
                r1.FIv(this, C344877sZ.IGLU_FILTER_UPDATER);
            }
            if (r3 != null) {
                r3.EBc(this, C344877sZ.IGLU_FILTER_UPDATER);
            }
            this.A03 = r3;
        }
    }

    public AnonymousClass9g9(C366028o4 r6, C365998o1 r7) {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A06 = A1E;
        this.A09 = r7;
        this.A04 = r6;
        this.A05 = new IgluFilterNativeGraph();
        A1E.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new Pair(new FilterManagerImpl(r6, (C40136ATc) null), (Object) null));
        this.A08 = new C366078o9();
    }

    public final void Ddr(C344907sc r3) {
        if (r3.CAG() == C344877sZ.IGLU_FILTER_UPDATER) {
            throw AnonymousClass7TE.A11("getUpdater");
        }
    }
}
