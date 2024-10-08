package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8L9  reason: invalid class name */
public final class AnonymousClass8L9 implements AnonymousClass8LA, C352278Cs {
    public TargetViewSizeProvider A00;
    public C354188Kz A01;
    public TransformMatrixConfig A02;
    public AnonymousClass3Q2 A03;
    public C349307zv A04;
    public List A05;
    public List A06;
    public C351968Bd A07 = C351968Bd.SMART_TRACKING_FIT;
    public final UserSession A08;

    public final void DtC() {
        C349307zv r5;
        TransformMatrixConfig transformMatrixConfig = this.A02;
        if (transformMatrixConfig != null && (r5 = this.A04) != null) {
            AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(497892810, 3));
            AnonymousClass9KB r3 = new AnonymousClass9KB(this, r5, transformMatrixConfig, (AnonymousClass4D7) null, 4);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A022);
        }
    }

    public final void DtD(int i) {
    }

    public final void DtE() {
    }

    public final C354188Kz A00() {
        C354188Kz r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("freeTransformVideoController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dxn(int i) {
        C349307zv r2;
        List list;
        Float valueOf;
        AnonymousClass3Q2 r0;
        AnonymousClass3Q2 r02;
        C351968Bd r03 = this.A07;
        C351968Bd r3 = C351968Bd.SMART_TRACKING_FILL;
        if (r03 == r3 && A00().A08() == C351968Bd.SMART_TRACKING_FIT) {
            C354188Kz A002 = A00();
            TransformMatrixConfig transformMatrixConfig = A002.A05;
            if (transformMatrixConfig != null) {
                transformMatrixConfig.A02();
                C354188Kz.A03(A002);
            }
            AnonymousClass3Q2 r04 = this.A03;
            if (r04 != null) {
                AnonymousClass3QG r05 = r04.A1i;
                r05.A03 = null;
                r05.A02 = null;
            }
        }
        if (this.A07 == r3 && A00().A08() == C351968Bd.SMART_TRACKING_FREE_TRANSFORM && (r02 = this.A03) != null) {
            AnonymousClass3QG r06 = r02.A1i;
            r06.A03 = null;
            r06.A02 = null;
        }
        C351968Bd r1 = this.A07;
        C351968Bd r4 = C351968Bd.SMART_TRACKING_FIT;
        if ((r1 == r4 || r1 == C351968Bd.SMART_TRACKING_FREE_TRANSFORM) && A00().A08() == r3 && (r0 = this.A03) != null) {
            List list2 = this.A06;
            List list3 = this.A05;
            AnonymousClass3QG r07 = r0.A1i;
            r07.A03 = list2;
            r07.A02 = list3;
        }
        if (A00().A08() == r3 && (r2 = this.A04) != null) {
            TransformMatrixConfig transformMatrixConfig2 = A00().A05;
            if (transformMatrixConfig2 != null) {
                transformMatrixConfig2.A02();
            }
            TargetViewSizeProvider targetViewSizeProvider = this.A00;
            if (targetViewSizeProvider != null) {
                float width = (float) ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth();
                TargetViewSizeProvider targetViewSizeProvider2 = this.A00;
                if (targetViewSizeProvider2 != null) {
                    float min = Math.min(5.0f, Math.max(0.3f, (((float) r2.A0K) / ((float) r2.A08)) / (width / ((float) ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K.getHeight()))));
                    TransformMatrixConfig transformMatrixConfig3 = A00().A05;
                    if (transformMatrixConfig3 != null) {
                        transformMatrixConfig3.A08.A01 = min;
                    }
                    UserSession userSession = this.A08;
                    String str = r2.A0k;
                    int i2 = r2.A0K;
                    int i3 = i * IgNetworkConsentStorage.MAX_ENTRIES;
                    0qQ.A0B(str, 1);
                    C39759A7z A003 = AnonymousClass8LF.A00(userSession).A00(str);
                    if (!(A003 == null || (list = A003.A06) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list) {
                            if (((Number) next).intValue() <= i3) {
                                arrayList.add(next);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int intValue = ((Number) 00k.A0K(arrayList)).intValue();
                            Iterator it = list.iterator();
                            int i4 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Number) it.next()).intValue() == intValue) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    i4 = -1;
                                    break;
                                }
                            }
                            Integer valueOf2 = Integer.valueOf(i4);
                            if (valueOf2 != null) {
                                int intValue2 = valueOf2.intValue();
                                List list4 = A003.A04;
                                if (list4 != null) {
                                    if (list4.size() > intValue2) {
                                        C39684A5a a5a = (C39684A5a) list4.get(intValue2);
                                        if (!(a5a == null || (valueOf = Float.valueOf((((float) i2) * a5a.A00) / ((float) A003.A01))) == null)) {
                                            C354188Kz A004 = A00();
                                            float floatValue = valueOf.floatValue();
                                            float f = (float) r2.A0K;
                                            float f2 = 0.5f - (((((float) r2.A08) * 0.5625f) / 2.0f) / f);
                                            float max = Math.max(Math.min(((f / 2.0f) - floatValue) / f, f2), -f2);
                                            TransformMatrixConfig transformMatrixConfig4 = A004.A05;
                                            if (transformMatrixConfig4 != null) {
                                                TransformMatrixParams transformMatrixParams = transformMatrixConfig4.A08;
                                                transformMatrixParams.A02 = transformMatrixParams.A01 * transformMatrixConfig4.A00 * max;
                                                C354188Kz.A03(A004);
                                            }
                                        }
                                    } else {
                                        0KC.A0C("SmartTrackingDataModelHelper", 002.A02(intValue2, list4.size(), "Index out of bound. Index: ", " Size: "));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("targetViewSizeProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        C351968Bd A082 = A00().A08();
        if (A082 == null) {
            A082 = r4;
        }
        this.A07 = A082;
    }

    public AnonymousClass8L9(UserSession userSession) {
        this.A08 = userSession;
    }
}
