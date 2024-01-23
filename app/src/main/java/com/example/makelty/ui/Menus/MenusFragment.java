package com.example.makelty.ui.Menus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.makelty.databinding.FragmentMenusBinding;
import com.example.makelty.ui.Settings.MenusViewModel;

public class MenusFragment extends Fragment {

    private FragmentMenusBinding binding;
    private MenusViewModel menusViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMenusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        menusViewModel = new ViewModelProvider(this).get(MenusViewModel.class);
        menusViewModel.getText().observe(getViewLifecycleOwner(), text -> binding.textMenus.setText(text));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
