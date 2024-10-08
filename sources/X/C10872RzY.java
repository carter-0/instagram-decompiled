package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.facebook.spm.SentencePieceModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.RzY  reason: case insensitive filesystem */
public final class C10872RzY {
    public final AnonymousClass40G A00(C258993zy r13, SentencePieceModel sentencePieceModel, List list, C348037xm r16) {
        HashMap hashMap = ((Example) list.get(0)).A02;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (((FeatureData) A1J.getValue()).A02 == Type.STRING) {
                Dbb.A1V(A1J, A1H);
            }
        }
        String str = ((FeatureData) 00k.A09(A1H.values())).A04;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return new AnonymousClass40G(0sn.A00, "No string input provided", false);
        }
        ArrayList A0v = DbS.A0v(r3);
        for (int i : sentencePieceModel.encode(str)) {
            AnonymousClass7TF.A1M(A0v, i + 1);
        }
        if (r13 != null) {
            r13.A01("spm_encode_end");
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A0v);
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A1Y(A0r, (long) AnonymousClass7TG.A0F(it));
        }
        Tensor fromBlob = Tensor.fromBlob(00k.A0y(A0r), new long[]{1, (long) A0v.size()});
        Tensor fromBlob2 = Tensor.fromBlob(new long[]{(long) A0v.size()}, new long[]{1});
        int size = A0v.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = 1;
        }
        Tensor fromBlob3 = Tensor.fromBlob(jArr, new long[]{1, (long) A0v.size()});
        if (r13 != null) {
            r13.A01("feature_transform_end");
        }
        float[] dataAsFloatArray = r16.A00.forward(IValue.dictStringKeyFrom(DbY.A0q("pad_mask", IValue.from(fromBlob3), AnonymousClass7TE.A1L("token_ids", IValue.from(fromBlob)), AnonymousClass7TE.A1L("seq_lens", IValue.from(fromBlob2))))).toTensor().getDataAsFloatArray();
        if (r13 != null) {
            r13.A01("pytorch_forward_end");
        }
        0qQ.A0A(dataAsFloatArray);
        ArrayList A0v2 = DbS.A0v(r3);
        for (float f : dataAsFloatArray) {
            Pxf.A1Q(A0v2, (double) f);
        }
        return new AnonymousClass40G(A0v2, (String) null, true);
    }
}
