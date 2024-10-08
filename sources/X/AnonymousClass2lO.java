package X;

/* renamed from: X.2lO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2lO implements AnonymousClass2lP {
    public final /* synthetic */ C228322lL A00;

    public /* synthetic */ AnonymousClass2lO(C228322lL r1) {
        this.A00 = r1;
    }

    public final void AJj(C233632w4 r12, C238523Ce r13, Double d, String str, String str2, boolean z) {
        Integer num;
        String str3;
        C228322lL r2 = this.A00;
        if (z || !r2.A05) {
            r2.A00.markerEnd(424097382, 2);
            if (str != null) {
                Integer[] A002 = AnonymousClass05K.A00(8);
                int length = A002.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        num = A002[i];
                        switch (num.intValue()) {
                            case 1:
                                str3 = "STORIES_TRAY_REFRESH";
                                break;
                            case 2:
                                str3 = "FEED_TIMELINE_REFRESH";
                                break;
                            case 3:
                                str3 = "ON_STORIES_LAUNCHING";
                                break;
                            case 4:
                                str3 = "STORIES_TRAY_SCROLL_STATE_CHANGE";
                                break;
                            case 5:
                                str3 = "STORIES_TRAY_CLIENT_SIDE_RESORT";
                                break;
                            case 6:
                                str3 = "SCREEN_TRAY_TIME_THRESHOLD_MET";
                                break;
                            case 7:
                                str3 = "WARM_START_NO_REFRESH";
                                break;
                            default:
                                str3 = "SURFACE_FETCH";
                                break;
                        }
                        if (!str3.equalsIgnoreCase(str)) {
                            i++;
                        }
                    }
                }
            }
            num = null;
            C228322lL.A04(new AnonymousClass9J0(d, (Object) null, (String) null, 5, false), r2, num, str2);
            return;
        }
        C233812wV r1 = r2.A03;
        if (r1 != null && r2.A0N) {
            r1.A0X.Ch1((String) null, (String) null, (String) null, "INSTAGRAM_PREFETCH_REQUEST_ODML_LOW_VALUE_PREDICTION", false, false);
        }
        r2.A00.markerEnd(424097382, 3);
    }
}
