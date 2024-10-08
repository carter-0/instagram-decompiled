package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.2jd  reason: invalid class name and case insensitive filesystem */
public final class C227622jd {
    public final ArrayList A00 = new ArrayList();

    public final void A0C(View view) {
        0qQ.A0B(view, 0);
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.D6z(view);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public static final C252243on A00(C227622jd r1, int i) {
        ArrayList arrayList = r1.A00;
        if (i < arrayList.size()) {
            return (C252243on) arrayList.get(i);
        }
        return null;
    }

    public final void A01() {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onCreate();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A02() {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onDestroy();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A03() {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onDestroyView();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A04() {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onPause();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A05() {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onResume();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A06() {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onStart();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07() {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onStop();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A08(int i, int i2, Intent intent) {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onActivityResult(i, i2, intent);
                }
                if (i3 >= 0) {
                    size = i3;
                } else {
                    return;
                }
            }
        }
    }

    public final void A09(Configuration configuration) {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onConfigurationChanged(configuration);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0A(Bundle bundle) {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onSaveInstanceState(bundle);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0B(Bundle bundle) {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onViewStateRestored(bundle);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0D(View view, Bundle bundle) {
        int size = this.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A002 = A00(this, size);
                if (A002 != null) {
                    A002.onViewCreated(view, bundle);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0E(C252243on r3) {
        if (r3 != null) {
            ArrayList arrayList = this.A00;
            if (!arrayList.contains(r3)) {
                arrayList.add(r3);
            }
        }
    }
}
