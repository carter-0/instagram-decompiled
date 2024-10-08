package com.instagram.creation.capture.quickcapture.ourstory.viewmodel;

import X.00l;
import X.018;
import X.0eS;
import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass8ZE;
import X.C376669Iw;
import X.C60340gF;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.ourstory.viewmodel.OurStoryPostCaptureViewModel$viewState$1", f = "OurStoryPostCaptureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OurStoryPostCaptureViewModel$viewState$1 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;

    public OurStoryPostCaptureViewModel$viewState$1(AnonymousClass4D7 r2) {
        super(4, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OurStoryPostCaptureViewModel$viewState$1 ourStoryPostCaptureViewModel$viewState$1 = new OurStoryPostCaptureViewModel$viewState$1((AnonymousClass4D7) obj4);
        ourStoryPostCaptureViewModel$viewState$1.A00 = obj;
        ourStoryPostCaptureViewModel$viewState$1.A01 = obj2;
        ourStoryPostCaptureViewModel$viewState$1.A02 = obj3;
        return ourStoryPostCaptureViewModel$viewState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        String str = (String) this.A00;
        List<DirectShareTarget> list = (List) this.A01;
        C376669Iw r3 = (C376669Iw) this.A02;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (DirectShareTarget A0B : list) {
            018.A16(A0B.A0B(), arrayList);
        }
        boolean z = true;
        if (!(!00l.A0W(str)) || list.size() < 1) {
            z = false;
        }
        return new AnonymousClass8ZE(r3, str, arrayList, size, z);
    }
}
