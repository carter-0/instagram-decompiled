package X;

public final class GM8 extends C252233om {
    public final int A00;
    public final Object A01;

    public GM8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDestroy() {
        switch (this.A00) {
            case 0:
                AnonymousClass2xS r0 = ((C57258IUt) this.A01).A02;
                if (r0 != null) {
                    r0.A0G.A0L();
                    return;
                }
                return;
            case 1:
                FF8 ff8 = (FF8) this.A01;
                ff8.A0D.dismiss();
                ff8.A00 = null;
                return;
            default:
                super.onDestroy();
                return;
        }
    }

    public final void onDestroyView() {
        if (this.A00 != 0) {
            super.onDestroyView();
            return;
        }
        AnonymousClass2xS r0 = ((C57258IUt) this.A01).A02;
        if (r0 != null) {
            r0.A0G.A0U("finished", false, false);
        }
    }

    public final void onPause() {
        if (this.A00 != 0) {
            super.onPause();
            return;
        }
        C57258IUt iUt = (C57258IUt) this.A01;
        AnonymousClass2xS r0 = iUt.A02;
        if (r0 != null) {
            r0.A0G.A0T("fragment_paused");
            C57258IUt.A00(iUt, iUt.A05.A0A(41));
        }
    }

    public final void onResume() {
        if (this.A00 != 0) {
            super.onResume();
            return;
        }
        AnonymousClass2xS r0 = ((C57258IUt) this.A01).A02;
        if (r0 != null) {
            r0.A0G.A0M();
        }
    }

    public final void onStart() {
        if (2 - this.A00 != 0) {
            super.onStart();
            return;
        }
        C52029GCb gCb = (C52029GCb) this.A01;
        AnonymousClass1Nd.A00(gCb.A0C).A01(gCb.A0B, AnonymousClass3EJ.class);
    }

    public final void onStop() {
        if (2 - this.A00 != 0) {
            super.onStop();
            return;
        }
        C52029GCb gCb = (C52029GCb) this.A01;
        AnonymousClass1Nd.A00(gCb.A0C).A02(gCb.A0B, AnonymousClass3EJ.class);
        gCb.A08.unregisterLifecycleListener(this);
    }
}
