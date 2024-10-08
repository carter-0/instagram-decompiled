package X;

import com.instagram.api.schemas.CameraTool;

public final class LMH {
    public CameraTool A00;
    public LN5 A01;

    public LMH(CameraTool cameraTool, LN5 ln5) {
        AnonymousClass7TG.A1O(cameraTool, ln5);
        this.A00 = cameraTool;
        this.A01 = ln5;
    }

    public LMH() {
        this(CameraTool.UNRECOGNIZED, new LN5("", "", "", "", "", "", "", "", ""));
    }
}
