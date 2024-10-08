package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;

/* renamed from: X.Ksy  reason: case insensitive filesystem */
public abstract class C63191Ksy {
    public static final GenAIToolInfoDict A00(LMH lmh) {
        LN5 ln5 = lmh.A01;
        String str = ln5.A00;
        String str2 = ln5.A01;
        String str3 = ln5.A02;
        String str4 = ln5.A06;
        CameraTool cameraTool = lmh.A00;
        String str5 = ln5.A07;
        return new GenAIToolInfoDict(cameraTool, str, str2, str3, ln5.A03, ln5.A04, ln5.A05, str4, str5);
    }
}
