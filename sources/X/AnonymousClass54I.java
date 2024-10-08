package X;

/* renamed from: X.54I  reason: invalid class name */
public final class AnonymousClass54I implements AnonymousClass0II {
    public static final void A00(int i, String str) {
        02m.A0p.markerStart(17631596, i, "function_name", str);
    }

    public final void DPv(0IE r6) {
        Exception exc;
        String str;
        String str2;
        String str3;
        int i = r6.A00;
        if (r6 instanceof AnonymousClass0Lj) {
            A00(i, "ConfigureWithMediaCrypto");
            02m.A0p.markerAnnotate(17631596, i, "flags", ((AnonymousClass0Lj) r6).A00);
            return;
        }
        if (!(r6 instanceof AnonymousClass0Li)) {
            if (r6 instanceof 0Lk) {
                exc = ((0Lk) r6).A00;
            } else {
                if (r6 instanceof 0LB) {
                    A00(i, "CreateByCodecName");
                    str2 = ((0LB) r6).A00;
                    str3 = "codec_name";
                } else if (!(r6 instanceof 0L5)) {
                    if (r6 instanceof 0LJ) {
                        exc = ((0LJ) r6).A00;
                    } else if (r6 instanceof 0Kt) {
                        A00(i, "CreateDecoder");
                        str2 = ((0Kt) r6).A00;
                        str3 = "codec_type";
                    } else if (!(r6 instanceof 0Ks)) {
                        if (r6 instanceof 0Ku) {
                            exc = ((0Ku) r6).A00;
                        } else if (r6 instanceof 0Km) {
                            A00(i, "CreateEncoder");
                            02m.A0p.markerAnnotate(17631596, i, "flags", ((0Km) r6).A00);
                            return;
                        } else if (!(r6 instanceof 0Kb)) {
                            if (r6 instanceof 0Kr) {
                                exc = ((0Kr) r6).A00;
                            } else {
                                if (r6 instanceof AnonymousClass0KU) {
                                    str = "MediaCodecRelease";
                                } else if (!(r6 instanceof AnonymousClass0KT)) {
                                    if (r6 instanceof 0KW) {
                                        exc = ((0KW) r6).A00;
                                    } else if (r6 instanceof C59130Jq) {
                                        str = "MediaCodecStart";
                                    } else if (!(r6 instanceof AnonymousClass0Jk)) {
                                        if (r6 instanceof 0KE) {
                                            exc = ((0KE) r6).A00;
                                        } else if (r6 instanceof AnonymousClass0JY) {
                                            str = "MediaCodecStop";
                                        } else if (!(r6 instanceof AnonymousClass0JV)) {
                                            if (r6 instanceof 0Jh) {
                                                exc = ((0Jh) r6).A00;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                A00(i, str);
                                return;
                            }
                        }
                    }
                }
                02m.A0p.markerAnnotate(17631596, i, str3, str2);
                return;
            }
            02m r4 = 02m.A0p;
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            r4.markerAnnotate(17631596, i, "codec_exception", message);
            02m.A0p.markerEnd(17631596, i, 3);
            return;
        }
        02m.A0p.markerEnd(17631596, i, 2);
    }
}
