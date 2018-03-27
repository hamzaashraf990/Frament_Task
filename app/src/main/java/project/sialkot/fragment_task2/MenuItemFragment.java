package project.sialkot.fragment_task2;

import android.app.Fragment;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuItemFragment extends Fragment {
    public static final String ITEM_TEXT = "texto_del_item";


    private Context context;
    private View rootView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = LayoutInflater.from(context).inflate(R.layout.activity_menu_item_fragment, container, false);

        TextView textView =(TextView) rootView.findViewById(R.id.textView);

        String txt = getArguments().getString(ITEM_TEXT);
        textView.setText(txt);


        return rootView;
    }


}
