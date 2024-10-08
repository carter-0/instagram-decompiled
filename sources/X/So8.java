package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.pytorch.executorch.EValue;
import org.pytorch.executorch.Tensor;

public final class So8 implements C258833zi {
    public final C10404Rrg A00;
    public final C258743zZ A01;
    public final C62989Kpf A02;

    public So8(C62989Kpf kpf, C10404Rrg rrg, C258743zZ r4) {
        0qQ.A0B(rrg, 3);
        this.A01 = r4;
        this.A02 = kpf;
        this.A00 = rrg;
    }

    public final AnonymousClass40G E3X(C258993zy r18, List list) {
        AnonymousClass40G r1;
        AnonymousClass40G r12;
        Exception exc;
        0sn r4;
        String str;
        EValue eValue;
        Tensor tensor;
        int i;
        long j;
        Type type;
        Object obj;
        String str2;
        C258993zy r9 = r18;
        if (r18 != null) {
            try {
                C258743zZ r2 = this.A01;
                r9.A02("model_name", r2.BTg());
                r9.A02("model_version", String.valueOf(r2.BTh()));
                r9.A02("model_asset_name", r2.BTd());
            } catch (Exception e) {
                return Pxg.A0Q(e);
            }
        }
        C10404Rrg rrg = this.A00;
        C258743zZ r42 = this.A01;
        String A012 = rrg.A00.A01(r42.CCQ());
        if (A012.length() == 0) {
            r1 = new AnonymousClass40G((Object) null, 002.A0R("Model file is not found for ", r42.CCQ()), false);
        } else {
            r42.CCQ();
            1RH A002 = 1RH.A00();
            1US r13 = 1US.A1D;
            if (!A002.A05(r13)) {
                str2 = "Pytorch is not downloaded on device";
            } else if (1RH.A00().A06(r13) || 1RH.A00().A07(r13)) {
                try {
                    r1 = Pxf.A0M(C39660A4a.A00(A012, 0));
                } catch (Throwable th) {
                    r1 = new AnonymousClass40G((Object) null, th.getMessage(), false);
                }
            } else {
                str2 = "Pytorch is not loaded on device";
            }
            r1 = new AnonymousClass40G((Object) null, str2, false);
        }
        if (r18 != null) {
            r9.A01("loaded_model_path");
        }
        C39660A4a a4a = (C39660A4a) r1.A00;
        if (!r1.A02 || a4a == null) {
            return AnonymousClass40H.A00(r1, 0sn.A00);
        }
        List list2 = list;
        try {
            if (list2.isEmpty()) {
                r12 = new AnonymousClass40G(0sn.A00, "no examples", false);
            } else {
                if (r18 != null) {
                    r9.A01("prepare_features");
                }
                EValue[] execute = a4a.A00.execute("get_feature_list", new EValue[0]);
                0qQ.A07(execute);
                ArrayList A0v = DbS.A0v(r3);
                for (EValue eValue2 : execute) {
                    A0v.add(String.valueOf(eValue2.toInt()));
                }
                if (list2.isEmpty()) {
                    exc = new Exception("examples list is empty");
                } else if (!A0v.isEmpty()) {
                    int size = list2.size();
                    int size2 = A0v.size();
                    int i2 = size * size2;
                    float[] fArr = new float[i2];
                    long[] jArr = new long[i2];
                    for (int i3 = 0; i3 < size; i3++) {
                        HashMap hashMap = ((Example) list2.get(i3)).A02;
                        if (!hashMap.isEmpty()) {
                            for (int i4 = 0; i4 < size2; i4++) {
                                Object obj2 = A0v.get(i4);
                                if (hashMap.containsKey(obj2)) {
                                    i = (i3 * size2) + i4;
                                    FeatureData featureData = (FeatureData) hashMap.get(obj2);
                                    Type type2 = null;
                                    if (!(featureData == null || (type = featureData.A02) == null)) {
                                        int ordinal = type.ordinal();
                                        if (ordinal == 1) {
                                            obj = Double.valueOf(featureData.A00);
                                        } else if (ordinal == 0) {
                                            obj = Long.valueOf(featureData.A01);
                                        }
                                        fArr[i] = AnonymousClass7TE.A04(obj);
                                        j = 1;
                                    }
                                    StringBuilder A1A = AnonymousClass7TE.A1A();
                                    A1A.append("transformDenseNumericalFeaturesToTensors only accepts features of long/double type. Got '");
                                    if (featureData != null) {
                                        type2 = featureData.A02;
                                    }
                                    A1A.append(type2);
                                    String A0l = AnonymousClass7TF.A0l("' instead.", A1A);
                                    0qQ.A0B(A0l, 1);
                                    exc = new Exception(A0l);
                                } else {
                                    i = (i3 * size2) + i4;
                                    fArr[i] = 0.0f;
                                    j = 0;
                                }
                                jArr[i] = j;
                            }
                            continue;
                        }
                    }
                    long j2 = (long) size;
                    long j3 = (long) size2;
                    Tensor fromBlob = Tensor.fromBlob(fArr, new long[]{j2, j3});
                    Tensor.fromBlob(jArr, new long[]{j2, j3});
                    if (r18 != null) {
                        r9.A01("transform_features");
                    }
                    EValue[] forward = a4a.A00.forward(EValue.from(fromBlob));
                    if (r18 != null) {
                        r9.A01("run_inference");
                    }
                    if (!(forward == null || (eValue = forward[0]) == null || (tensor = eValue.toTensor()) == null)) {
                        List<Object> A0F = 03t.A0F(tensor.getDataAsFloatArray());
                        ArrayList<Object> A0p = AnonymousClass7TF.A0p(A0F);
                        for (Object A04 : A0F) {
                            Pxf.A1Q(A0p, (double) AnonymousClass7TE.A04(A04));
                        }
                        if (!A0p.isEmpty()) {
                            if (A0p.size() != list2.size()) {
                                r4 = 0sn.A00;
                                str = 002.A02(list2.size(), A0p.size(), "examples count: ", ", results count: ");
                                r12 = new AnonymousClass40G(r4, str, false);
                            } else {
                                ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
                                for (Object A003 : A0p) {
                                    Pxf.A1Q(A0p2, JTO.A00(A003));
                                }
                                r12 = new AnonymousClass40G(A0p2, (String) null, true);
                            }
                        }
                    }
                    r4 = 0sn.A00;
                    str = "no results";
                    r12 = new AnonymousClass40G(r4, str, false);
                } else {
                    exc = new Exception("feature id list is empty");
                }
                throw exc;
            }
        } catch (Exception e2) {
            try {
                r12 = Pxg.A0Q(e2);
            } catch (Exception e3) {
                return Pxg.A0Q(e3);
            }
        }
        if (r18 == null) {
            return r12;
        }
        r9.A01("predicted");
        return r12;
    }
}
