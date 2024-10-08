package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.So9  reason: case insensitive filesystem */
public final class C12158So9 implements C258833zi {
    public final S4A A00;
    public final C258743zZ A01;
    public final C9264RVp A02;

    public final AnonymousClass40G E3X(C258993zy r18, List list) {
        AnonymousClass40G r1;
        Exception exc;
        0sn r5;
        String str;
        IValue[] tuple;
        IValue iValue;
        Tensor tensor;
        int i;
        long j;
        Type type;
        Object obj;
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
        AnonymousClass40G A002 = this.A00.A00(this.A01);
        if (r18 != null) {
            r9.A01("loaded_model_path");
        }
        C348037xm r7 = (C348037xm) A002.A00;
        if (!A002.A02 || r7 == null) {
            return AnonymousClass40H.A00(A002, 0sn.A00);
        }
        List list2 = list;
        try {
            if (list2.isEmpty()) {
                r1 = new AnonymousClass40G(0sn.A00, "no examples", false);
            } else {
                long[] longList = r7.A00.runMethod("get_feature_list", new IValue[0]).toLongList();
                0qQ.A07(longList);
                ArrayList A0v = DbS.A0v(r3);
                for (long valueOf : longList) {
                    A0v.add(String.valueOf(valueOf));
                }
                if (r18 != null) {
                    r9.A01("prepare_features");
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
                    Tensor fromBlob = Tensor.fromBlob(fArr, new long[]{j2, j3}, XF6.CONTIGUOUS);
                    Tensor fromBlob2 = Tensor.fromBlob(jArr, new long[]{j2, j3});
                    if (r18 != null) {
                        r9.A01("transform_features");
                    }
                    Map dictStringKey = r7.A00.forward(IValue.tupleFrom(IValue.from(fromBlob), IValue.from(fromBlob2))).toDictStringKey();
                    if (r18 != null) {
                        r9.A01("run_inference");
                    }
                    0qQ.A0A(dictStringKey);
                    if (!dictStringKey.containsKey("prediction")) {
                        r5 = 0sn.A00;
                        str = "result does not contain key prediction";
                    } else {
                        IValue iValue2 = (IValue) dictStringKey.get("prediction");
                        if (!(iValue2 == null || (tuple = iValue2.toTuple()) == null || (iValue = tuple[0]) == null || (tensor = iValue.toTensor()) == null)) {
                            List<Object> A0F = 03t.A0F(tensor.getDataAsFloatArray());
                            if (!A0F.isEmpty()) {
                                if (A0F.size() != list2.size()) {
                                    r5 = 0sn.A00;
                                    str = 002.A02(list2.size(), A0F.size(), "examples count: ", ", results count: ");
                                } else {
                                    ArrayList A0r = AnonymousClass7TG.A0r(A0F);
                                    for (Object A04 : A0F) {
                                        Pxf.A1Q(A0r, (double) AnonymousClass7TE.A04(A04));
                                    }
                                    r1 = new AnonymousClass40G(A0r, (String) null, true);
                                }
                            }
                        }
                        r5 = 0sn.A00;
                        str = "no results";
                    }
                    r1 = new AnonymousClass40G(r5, str, false);
                } else {
                    exc = new Exception("feature id list is empty");
                }
                throw exc;
            }
        } catch (Exception e2) {
            try {
                r1 = Pxg.A0Q(e2);
            } catch (Exception e3) {
                return Pxg.A0Q(e3);
            }
        }
        if (r18 == null) {
            return r1;
        }
        r9.A01("predicted");
        return r1;
    }

    public C12158So9(C9264RVp rVp, S4A s4a, C258743zZ r3) {
        AnonymousClass7TG.A1U(r3, rVp, s4a);
        this.A01 = r3;
        this.A02 = rVp;
        this.A00 = s4a;
    }
}
