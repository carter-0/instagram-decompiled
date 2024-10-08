package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class UFN extends 08m {
    public static final boolean DEBUG = false;
    public static final String TAG = "FragmentPagerAdapter";
    public ViewGroup mContainer;
    public final Map mCreatedFragment = new LinkedHashMap();
    public 06p mCurTransaction = null;
    public Fragment mCurrentPrimaryItem = null;
    public final 0hq mFragmentManager;
    public List mFragmentsWithDeferredMenuVisibility;

    public abstract Fragment createItem(int i);

    public long getItemId(int i) {
        return (long) i;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public static String makeFragmentName(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A00(2606));
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        0s1 r0 = this.mCurTransaction;
        if (r0 == null) {
            r0 = new 0s1(this.mFragmentManager);
            this.mCurTransaction = r0;
        }
        r0.A02((Fragment) obj);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        List<Fragment> list = this.mFragmentsWithDeferredMenuVisibility;
        if (list != null) {
            for (Fragment fragment : list) {
                if (fragment != this.mCurrentPrimaryItem) {
                    fragment.setMenuVisibility(false);
                }
            }
            this.mFragmentsWithDeferredMenuVisibility = null;
        }
        06p r0 = this.mCurTransaction;
        if (r0 != null) {
            r0.A01();
            this.mCurTransaction = null;
            this.mFragmentManager.A0a();
        }
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment2 != null) {
            if (!fragment2.mUserVisibleHint) {
                fragment2.setUserVisibleHint(true);
            }
            if (!fragment2.isMenuVisible()) {
                fragment2.setMenuVisibility(true);
            }
        }
    }

    public final Fragment getItem(int i) {
        this.mContainer.getClass();
        String makeFragmentName = makeFragmentName(this.mContainer.getId(), (long) i);
        Fragment A0R = this.mFragmentManager.A0R(makeFragmentName);
        if (A0R != null) {
            return A0R;
        }
        Fragment fragment = (Fragment) this.mCreatedFragment.get(makeFragmentName);
        if (fragment != null) {
            return fragment;
        }
        Fragment createItem = createItem(i);
        this.mCreatedFragment.put(makeFragmentName, createItem);
        return createItem;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = new 0s1(this.mFragmentManager);
        }
        long j = (long) i;
        String makeFragmentName = makeFragmentName(viewGroup.getId(), j);
        Fragment A0R = this.mFragmentManager.A0R(makeFragmentName);
        if (A0R != null) {
            this.mCurTransaction.A08(A0R);
        } else {
            A0R = getItem(i);
            this.mCurTransaction.A0C(A0R, makeFragmentName(viewGroup.getId(), j), viewGroup.getId());
            this.mCreatedFragment.remove(makeFragmentName);
        }
        List list = this.mFragmentsWithDeferredMenuVisibility;
        if (list != null) {
            list.add(A0R);
        }
        if (A0R != this.mCurrentPrimaryItem) {
            A0R.setUserVisibleHint(false);
            if (this.mFragmentsWithDeferredMenuVisibility == null) {
                A0R.setMenuVisibility(false);
            }
        }
        return A0R;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return AnonymousClass7TF.A1W(((Fragment) obj).mView, view);
    }

    public void setContainer(ViewGroup viewGroup) {
        this.mContainer = viewGroup;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                fragment2.setUserVisibleHint(false);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        this.mFragmentsWithDeferredMenuVisibility = new ArrayList();
    }

    public UFN(0hq r2) {
        this.mFragmentManager = r2;
    }
}
